package flexbox.ui;

import flexbox.boxtypes.BoxOrder;

/**
 * Contains information about basket items
 * @author Group D4
 */

public class BasketItemInfo {
    private BoxOrder box;
    private int boxType;

    /**
     * Constructs BasketItemInfo
     * @param box The box that is being added to the basket
     * @param boxType The box type of the box
     */
    public BasketItemInfo(BoxOrder box, int boxType) {
        this.box = box;
        this.boxType = boxType;
    }

    /**
     * Gets the box
     * @return The box
     */
    public BoxOrder getBox() {
        return box;
    }

    /**
     * Gets the box type of the box in this basket item
     * @return The type of box
     */
    public int getBoxType() {
        return boxType;
    }
}
