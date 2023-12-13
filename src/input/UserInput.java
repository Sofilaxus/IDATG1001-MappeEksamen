package input;

import iteminformation.Category;
import iteminformation.CategoryEnum;
import java.util.Scanner;

/**
 * Reads the user input.
 * The following methods have been implemented:
 * <ul>
 *     <li><code>stringReader()</code> - Is responsible for reading the user input as a String.
 *     </li>
 *     <li><code>intReader()</code> - Is responsible for reading the user input as an int.
 *     </li>
 *     <li><code>doubleReader()</code> - Is responsible for reading the user input as a double.
 *     </li>
 * </ul>
 * <ul>
 *     <li><code>command()</code> - Is responsible for checking if the user input matches a command.
 *     </li>
 *     <li><code>category()</code> - Is responsible for checking if the input matches a category.
 *     </li>
 * </ul>
 *
 * @author 10021
 * @version 2022.11.02
 */
public class UserInput
{
    // Fields
    private final Scanner readUserInput;
    private final CommandWords commandWords;
    private final Category category;

    /**
     * Constructs the User Input.
     */
    public UserInput()
    {
        readUserInput = new Scanner(System.in);
        commandWords = new  CommandWords();
        category = new Category();
    }

    /**
     * Read the input from the user as a String.
     *
     * @return returns the user input as a String.
     */
    public String stringReader()
    {
        while (!readUserInput.hasNext())
        {
            System.out.println("Please enter something.");
            readUserInput.next();
        }
        return readUserInput.nextLine();
    }

    /**
     * Read the input from the user as an int.
     *
     * @return returns the user input as an int.
     */
    public int intReader()
    {
        while (!readUserInput.hasNextInt())
        {
            System.out.println("Please enter a whole number.");
            readUserInput.next();
        }
        int integer = readUserInput.nextInt();
        readUserInput.nextLine();
        return integer;
    }



    /**
     * Read the double from the user as a double.
     *
     * @return returns the user input as a double.
     */
    public double doubleReader()
    {
        while (!readUserInput.hasNextDouble())
        {
            System.out.println("Please enter a number with a decimal.");
            readUserInput.next();
        }
        double doublee = readUserInput.nextDouble();
        readUserInput.nextLine();
        return doublee;
    }

    /**
     * Makes sure the user input matches the menu option.
     *
     * @return the matched command.
     */
    public CommandWordsEnum command()
    {
        CommandWordsEnum command = CommandWordsEnum.UNKNOWN;
        String activeCommand = readUserInput.nextLine().toLowerCase();

        //If user input does not match the command word as a string, the input is unknown.
        if (commandWords.getCommands().containsKey(activeCommand))
        {
            command = CommandWordsEnum.valueOf(String.valueOf(commandWords.getCommands()
                    .get(activeCommand)));
        }
        return command;
    }

    /**
     * Makes sure the user input matches the available categories.
     *
     * @return the category found.
     */
    public CategoryEnum category()
    {
        CategoryEnum foundCategory = CategoryEnum.UNKNOWN;
        String theCategory = readUserInput.nextLine();

        if (category.getCategories().containsKey(theCategory))
        {
            foundCategory = CategoryEnum.values()[Integer.parseInt(theCategory)];
        }
        return foundCategory;
    }
}
