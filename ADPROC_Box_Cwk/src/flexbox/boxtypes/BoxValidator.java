package flexbox.boxtypes;

/**
 *  Base class for box validation methods
 * @author Group D4
 */
public abstract class BoxValidator {
    public abstract boolean isValidForThisType(BoxData data);
    public abstract int getBoxType();
}
