package flexbox;

import flexbox.boxtypes.*;
import flexbox.ui.BasketItemInfo;

import java.util.ArrayList;

/**
 * The session of this box order
 * @author Group D4
 */
public class OrderSession {
    private final ArrayList<BoxValidator> boxValidators;
    private final ArrayList<BoxOrder> boxes;
    private double totalCost = 0;
    private int totalBoxQuantity = 0;

    /**
     * Creates a new order session object
     */
    OrderSession() {
        boxes = new ArrayList<>();
        boxValidators = new ArrayList<>(5);
        boxValidators.add(new BoxTypeOneValidator());
        boxValidators.add(new BoxTypeTwoValidator());
        boxValidators.add(new BoxTypeThreeValidator());
        boxValidators.add(new BoxTypeFourValidator());
        boxValidators.add(new BoxTypeFiveValidator());
    }

    /**
     * Gets the total cost of all the boxes (including their quantity considered
     * in the cost). stored in the basket
     * @return Total cost of all boxes
     */
    public double getTotalCost() {
        return Util.roundDoubleTo2dp(totalCost);
    }

    /**
     * Gets the total box count, with the quantity considered
     * @return Total boxes stored
     */
    public int getTotalBoxQuantity() {
        return totalBoxQuantity;
    }

    /**
     * Gets the total number of items in the basket
     * @return Total items in basket
     */
    public int getNumberItemsInBasket() {
        return boxes.size();
    }

    /**
     * Adds a box to the basket, also recalculating the basket statistics for example total cost
     * @param box The box to add to the basket
     */
    private void addBox(BoxOrder box) {
        boxes.add(box);
        totalCost += box.calculateTotalCost();
        totalBoxQuantity += box.getQuantity();
    }

    /**
     * Tries to add the box to the basket, given FlexBox supplies this type of box
     * @param boxData The data of the box
     * @param quantity The amount of said box
     * @return The box and box type if it was added, else null
     */
    public BasketItemInfo tryAddBox(BoxData boxData, int quantity) {
        BoxOrder box = new BoxOrder(boxData, quantity);

        //Validate FlexBox supplies this box type
        for (BoxValidator validator : boxValidators) {
            if (validator.isValidForThisType(box.getData())) {
                addBox(box);
                return new BasketItemInfo(box, validator.getBoxType());
            }
        }
        //return null if the box type is not supplied
        return null;
    }
}
