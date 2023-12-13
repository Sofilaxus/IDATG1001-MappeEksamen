package utility;

/**
 * A class that checks the validity of String, int and double.
 * The following methods have been implemented:
 * <ul>
 * <li><code>checkString(String stringToCheck)</code> - Is responsible for checking a String.
 * </li>
 * <li><code>checkInt(int intToCheck) </code> - Is responsible for checking an int.
 * </li>
 * <li><code>checkDouble(double doubleToCheck) </code> - Is responsible for checking a double.
 * </li>
 * <li><code>checkDiscount(int discountToCheck)</code> - Is responsible for checking if the
 * discount is more than 100 or less than 0.
 * </li>
 * </ul>
 *
 * @author 10021
 * @version 2022.10.05
 */
public class CheckValid
{

    /**
     * Method that checks if the String is true or false.
     * A false String is a String that is empty, or null.
     *
     * @param stringToCheck is the String you want to check.
     * @return a boolean after the check.
     */
    public boolean checkString(String stringToCheck)
    {
        return stringToCheck != null && stringToCheck != "";
    }

    /**
     * Method that checks if the int is true or false.
     * A false int is an int that is less than 0.
     *
     * @param intToCheck is the int you want to check.
     * @return a boolean after the check.
     */
    public boolean checkInt(int intToCheck)
    {
        return intToCheck >= 0;
    }

    /**
     * Method that checks if the double is true or false.
     * A false double is a double that is less than 0.0.
     *
     * @param doubleToCheck is the double you want to check.
     * @return a boolean after the check.
     */
    public boolean checkDouble(double doubleToCheck)
    {
        return doubleToCheck >= 0.0;
    }

    /**
     * Method that checks if the discount is true or false.
     * A false discount is a discount that is less than 0 and more than 100.
     *
     * @param discountToCheck is the discount you want to check.
     * @return a boolean after the check.
     */
    public boolean checkDiscount(int discountToCheck)
    {
        return discountToCheck <= 100 && discountToCheck >= 0;
    }
}
