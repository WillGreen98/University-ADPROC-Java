package flexbox;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Some utility functions that are used throughout the program
 * @author Group D4
 */

public class Util {
    /**
     * Round a double to 2 decimal places
     * @param nToRound The double to round
     * @return The rounded double
     */
    public static double roundDoubleTo2dp(double nToRound) {
        BigDecimal dec = BigDecimal.valueOf(nToRound);
        dec = dec.setScale(2, RoundingMode.HALF_UP);
        return dec.doubleValue();
    }

    /**
     * Formats a string with comma separators every 3 digits starting from the back
     * @param unformattedString The string to insert commas into
     * @param location For decimal numbers, the location should be the location of the .
     * @return A formatted string comma separators
     */
    private static String formatStringWithSeperators(String unformattedString, int location) {
        //Get number of , to insert into the string
        int seperatorCount = unformattedString.substring(0, location).length() / 3;

        //Create a string builder to create a new string
        StringBuilder outputCreator = new StringBuilder(unformattedString);
        for (int i = 0; i < seperatorCount; i++) {
            int insertLocation = location - 3 * (i + 1);
            //Do not allow , to be placed at very start of the string
            if (insertLocation > 0) {
                outputCreator.insert(insertLocation, ',');
            }
        }
        return outputCreator.toString();
    }

    /**
     * Take a number such as 10393 and converts to a more readable format such
     * as as 10,393
     * @param value The value to format into a string nicely
     * @return A formatted number using comma separators
     */
    public static String formatNumberWithSeperators(int value) {
        String nString = Integer.toString(value);
        return formatStringWithSeperators(nString, nString.length());
    }

    /**
     * Take a number such as 10393.12 and converts to a more readable format such
     * as as 10,393.12
     * @param value The value to format into a string nicely
     * @return A formatted number using comma separators
     */
    public static String formatNumberWithSeperators(double value) {
        String nString = Double.toString(value);

        //Find the decimal point location
        int location = 0;
        for (; location < nString.length(); location++) {
            if (nString.charAt(location) == '.') {
                break;
            }
        }

        return formatStringWithSeperators(nString, location);
    }
}
