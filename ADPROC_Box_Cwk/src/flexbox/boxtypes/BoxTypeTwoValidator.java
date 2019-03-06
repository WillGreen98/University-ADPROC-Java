package flexbox.boxtypes;

/**
 * Box validator for Box Type 2
 * @author Group D4
 */

public class BoxTypeTwoValidator extends BoxValidator {
    /**
     * Check if the box data passed in passed for FlexBox type2 2
     * @param data The box data
     * @return true if data is valid for this box type
     */
    @Override
    public boolean isValidForThisType(BoxData data) {
        return
            data.getGrade() >= 2 && data.getGrade() <= 4 &&
            data.getColour() == 1 &&
            !data.isBottomReinforced() &&
            !data.isCornerReinforced();
    }

    /**
     * Gets the box type for this validator
     * @return The box type
     */
    @Override
    public int getBoxType() {
        return 2;
    }
}
