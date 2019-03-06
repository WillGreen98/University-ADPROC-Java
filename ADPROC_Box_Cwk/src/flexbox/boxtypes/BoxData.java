package flexbox.boxtypes;

/**
 * Class to handle box data
 * @author Group D4
 */
public class BoxData {
    private int length, height, width;
    private int grade, colour;
    private boolean bottomReinforcement, cornerReinforcement, sealableTop;

    /**
     * Set the box length
     * @param length The new length of the box 
     */
    public void setLength(int length) {
        this.length = (length > 0) ? length : 0;
    }

    /**
     * Set the box height
     * @param height The new length of the box
     */
    public void setHeight(int height) {
        this.height = (height > 0) ? height : 0;
    }

    /**
     * Set the box width
     * @param width The new width of the box 
     */
    public void setWidth(int width) {
        this.width = (width > 0) ? width : 0;
    }

    /**
     * Set the box's cardboard grade
     * @param length The new grade for the cardboard
     */
    public void setGrade(int grade) {
        if(grade >=1 && grade <= 5) {
            this.grade = grade;
        } else if(grade < 1) {
            this.grade = 1;
        } else {
            this.grade = 5;
        }
    }

    /**
     * Sets the number of colour prints for the box
     * @param colour The new number of colour prints
     */
    public void setColour(int colour) {
        if(colour >= 0 && colour <= 2) {
            this.colour = colour;
        } else if(colour < 0) {
            this.colour = 0;
        } else {
            this.colour = 2;
        }
    }

    /**
     * Sets the bottom of the box to be either reinforced or not
     * @param bottomReinforcement Whether or not the box bottom should be reinforced
     */
    public void setBottomReinforcement (boolean bottomReinforcement){
        this.bottomReinforcement = bottomReinforcement;
    }

    /**
     * Sets the corner of the box to be either reinforced or not
     * @param cornerReinforcement Whether or not the box corner should be reinforced
     */
    public void setCornerReinforcement(boolean cornerReinforcement){
        this.cornerReinforcement = cornerReinforcement;
    }

    /**
     * Sets the top of the box to be either sealable or not
     * @param sealableTop Whether or not the box top should be sealable
     */
    public void setTopSealable(boolean sealableTop){
        this.sealableTop = sealableTop;
    }

    /**
     * Gets the box height
     * @return height of the box
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the box height
     * @return height of the box
     */
    public int getLength() {
        return length;
    }

    /**
     * Gets the box width
     * @return width of the box
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the box cardboard grade
     * @return grade of the box cardboard
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Gets the number of colour prints of the box
     * @return number of colour prints of the box
     */
    public int getColour() {
        return colour;
    }

    /**
     * Returns true if the box has a reinforced bottom
     * @return truth value for if the box has a reinforced bottom
     */
    public boolean isBottomReinforced(){
        return bottomReinforcement;
    }

    /**
     * Returns true if the box has a reinforced corner
     * @return truth value for if the box has a reinforced corner
     */
    public boolean isCornerReinforced(){
        return cornerReinforcement;
    }

    /**
     * Returns true if the box has a sealable top
     * @return truth value for if the box has a sealable top
     */
    public boolean isTopSealable(){
        return sealableTop;
    }
}
