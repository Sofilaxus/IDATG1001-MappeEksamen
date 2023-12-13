import input.MenuOptions;
import iteminformation.ItemRegister;
import userinterface.UserInterface;

/**
 * Represents the main class of the Warehouse Management System application.
 * The object of this class is responsible for starting the application, and
 * making sure that the application is running until the user exits.
 *
 * @author 10021
 * @version 2022.10.20
 */

public class WarehouseManagementSystem
{
    /**
     * The main method. Starts the application. When the application is running
     * from an operating system (e.g. Windows/MacOSX/Linux), the operating system
     * looks for the main-method, to know where to start the application from.
     *
     * @param args command line arguments as a fixed size array of strings.
    */
    public static void main(String[] args)
    {
        UserInterface userInterface = new UserInterface();
        userInterface.welcome();
        userInterface.mainMenu();

        ItemRegister itemRegister = userInterface.getItemRegister();
        userInterface.defaultItems();

        MenuOptions menuOptions = new MenuOptions(itemRegister, userInterface);
        menuOptions.keepRunning();
    }
}
