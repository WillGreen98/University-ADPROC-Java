package flexbox.boxtypes;
/**
 * Class to represent a quantity of a particlar box from the order
 * @author Group D4
 */
public class BoxOrder {
    private BoxData data;
    private int quantity;

    /**
     * Constructs a box
     * @param data The data of the box
     * @param quantity The amount of this box to order
     */
    public BoxOrder(BoxData data, int quantity) {
        this.data = data;
        this.quantity = quantity;
    }

    /**
     * Gets the box data
     * @return The box data
     */
    public BoxData getData() {
        return data;
    }

    /**
     * Gets the number of this box the customer wants to order
     * @return The quantity of this box
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Calculates the cost of a single one of these box
     * @return Cost of a single box
     */
    public double calculateSingleBoxCost() {
        double totalCost, baseCost, colourCost, bottomReinforcementCost, cornerReinforcementCost, sealableTopCost = 0;

        //Convert the values into millimeters
        double length = (double)data.getLength() / 1000.0;
        double height = (double)data.getHeight() / 1000.0;
        double width  = (double)data.getWidth()  / 1000.0;

        //Calulcate the surface area of all 6 sides of the box
        double area = (width * length * 2) + (width * height * 2) + (length * height * 2);

        switch(data.getGrade()) {
            case 1:
                baseCost = area * 0.55;
                break;
            case 2:
                baseCost = area * 0.65;
                break;
            case 3:
                baseCost = area * 0.82;
                break;
            case 4:
                baseCost = area * 0.98;
                break;
            default:
                baseCost = area * 1.50;
                break;
        }

        if(data.getColour() == 1) {
            colourCost = baseCost * 0.12;
        } else if(data.getColour() == 2) {
            colourCost = baseCost * 0.15;
        } else {
            colourCost = 0;
        }

        if(data.isBottomReinforced()) {
            bottomReinforcementCost = baseCost * 0.13;
        } else {
            bottomReinforcementCost = 0;
        }

        if(data.isCornerReinforced()) {
            cornerReinforcementCost = baseCost * 0.12;
        } else {
            cornerReinforcementCost = 0;
        }

        if(data.isTopSealable()) {
            sealableTopCost = baseCost * 0.10;
        } else {
            sealableTopCost = 0;
        }

        totalCost = baseCost + colourCost + bottomReinforcementCost + cornerReinforcementCost + sealableTopCost;
        return totalCost;
    }

    /**
     * Calulculates the cost of all the boxes
     * @return The total cost of the boxes
     */
    public double calculateTotalCost() {
        return calculateSingleBoxCost() * quantity;
    }
}