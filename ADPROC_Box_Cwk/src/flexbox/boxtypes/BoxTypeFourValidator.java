package flexbox.boxtypes;

/**
 * Box validator for Box Type 4
 * @author Group D4
 */

public class BoxTypeFourValidator extends BoxValidator {
    /**
     * Check if the box data passed in passed for FlexBox type 4
     * @param data The box data
     * @return true if data is valid for this box type
     */
    @Override
    public boolean isValidForThisType(BoxData data) {
        return
            data.getGrade() >= 2 &&
            data.getColour() == 2 &&
            data.isBottomReinforced() &&
            !data.isCornerReinforced();
    }

    /**
     * Gets the box type for this validator
     * @return The box type
     */
    @Override
    public int getBoxType() {
        return 4;
    }
}
