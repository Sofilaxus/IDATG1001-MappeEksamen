package userinterface;

import input.UserInput;
import iteminformation.CategoryEnum;
import iteminformation.Item;
import iteminformation.ItemRegister;
import java.util.Iterator;

/**
 * Contains all methods for printing. Everything that the terminal shows, is here.
 * All the menus and item printing is handled in this class.
 *
 * @author 10021
 * @version 2022.10.27
 */
public class UserInterface
{
    //Constants
    private final String TYPECOMMAND = "Please type one of the following commands.";
    private final String BORDER = "---------------------------------------"
            + "--------------------------------------";
    private final String CURRENCY = " kr";
    private final String MEASURE = " meters";
    private final String weight = " kg";
    private final String CASESENSITIVENO = "The input is not case sensitive.";
    private final String CASESENSITIVEYES = "The input is case sensitive.";

    //Fields
    private final ItemRegister itemRegister;
    private final UserInput userInput;

    //Constructor
    /**
     * Constructor for the User Interface.
     */
    public UserInterface()
    {
        itemRegister = new ItemRegister();
        userInput = new UserInput();
    }

    /**
     * Getter for the item register.
     *
     * @return the item register
     */
    public ItemRegister getItemRegister()
    {
        return itemRegister;
    }

    /**
     * The welcome. Prints out at the start of the application.
     */
    public void welcome()
    {
        System.out.println(BORDER);
        System.out.println("Warehouse Management System v0.1");
    }

    /**
     * The main menu. Prints out the main menu, that tells the user what commands are available.
     */
    public void mainMenu()
    {
        System.out.println(BORDER);
        System.out.println("This is the main menu.");
        System.out.println(TYPECOMMAND);
        System.out.println(CASESENSITIVENO);
        System.out.println(BORDER);
        System.out.println("Type ´PRINT´ to print out all items.");
        System.out.println("Type ´SEARCH´ to search for a specific item.");
        System.out.println("Type ´ADD´ to add a new item to the storage.");
        System.out.println("Type ´DELETE´ to go to the delete menu.");
        System.out.println("Type ´INVENTORY´ to increase or decrease items in the storage.");
        System.out.println("Type ´DESCRIPTION´ to change the description of an item.");
        System.out.println("Type ´COUPON´ to add, remove or change a coupon.");
        System.out.println("Type ´PRICE´ to add, remove or change the price of an item.");
        System.out.println("Type ´CATEGORY´ to go to the category menu.");
        System.out.println("Type ´MENU´ or ´HELP´ to go back to this menu.");
        System.out.println("Type ´EXIT´ to exit the application.");
        System.out.println(BORDER);
    }

    /**
     * The category menu.
     */
    public void categoryMenu()
    {
        System.out.println("This is the category menu.");
        System.out.println("Here you can see what the different categories are.");
        System.out.println("(This menu has no options, it is just for view)");
        System.out.println(BORDER);
        System.out.println("1 : Floor Laminates");
        System.out.println("2 : Windows");
        System.out.println("3 : Doors");
        System.out.println("4 : Lumber");
        System.out.println(BORDER);
    }

    //Search
    /**
     * The search menu, tells the user to type what they wish to search for.
     */
    public void searchMenu()
    {
        System.out.println("Type ´IN´ to search for an item by item number.");
        System.out.println("Type ´ID´ to search for an item by item description.");
        System.out.println(CASESENSITIVENO);
        System.out.println(BORDER);
    }

    /**
     * Prints out the menu that asks the user for their input.
     */
    public void searchMenuIn()
    {
        System.out.println("Please type the item number of the item you wish to search for.");
        System.out.println(CASESENSITIVEYES);
        System.out.println(BORDER);
    }

    /**
     * Prints out the menu that asks the user for their input.
     */
    public void searchMenuId()
    {
        System.out.println("Please type the item description of the item you wish to search for.");
        System.out.println(BORDER);
    }

    /**
     * Prints out the information of an item that has been searched if the item exists, if not,
     * it prints out that the item does not exist.
     *
     * @param searchedItem is the item that has been searched.
     */
    public void printSearchedItem(Item searchedItem)
    {
        if (searchedItem != null)
        {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(BORDER);
            stringBuilder.append("\n");
            stringBuilder.append(" | Item Number: ");
            stringBuilder.append(searchedItem.getItemNumber());
            stringBuilder.append(" | Item Description: ");
            stringBuilder.append(searchedItem.getItemDescription());
            stringBuilder.append(" | Price: ");
            stringBuilder.append(searchedItem.getPrice() + CURRENCY);
            stringBuilder.append(" | Brand: ");
            stringBuilder.append(searchedItem.getBrand());
            stringBuilder.append(" | Weight: ");
            stringBuilder.append(searchedItem.getItemWeight() + weight);
            stringBuilder.append("\n");
            stringBuilder.append(" | Length: ");
            stringBuilder.append(searchedItem.getItemLength() + MEASURE);
            stringBuilder.append(" | Height: ");
            stringBuilder.append(searchedItem.getItemHeight() + MEASURE);
            stringBuilder.append(" | Color: ");
            stringBuilder.append(searchedItem.getItemColor());
            stringBuilder.append(" | Storage amount: ");
            stringBuilder.append(searchedItem.getStorageAmount());
            stringBuilder.append(" | Category: ");
            stringBuilder.append(searchedItem.getItemCategory());
            stringBuilder.append("\n");
            stringBuilder.append(BORDER);
            System.out.println(stringBuilder.toString());
        } else
        {
            System.err.println("The item does not exist.");
        }
    }

    //Print
    /**
     * Uses an iterator to go through all the items in the item storage HashMap, and
     * prints it.
     *
     * @param itemIterator is the iterator.
     */
    public void printAll(Iterator<Item> itemIterator)
    {
        while (itemIterator.hasNext())
        {
            Item element = itemIterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(BORDER);
            stringBuilder.append("\n");
            stringBuilder.append(" | Item Number: ");
            stringBuilder.append(element.getItemNumber());
            stringBuilder.append(" | Item Description: ");
            stringBuilder.append(element.getItemDescription());
            stringBuilder.append(" | Price: ");
            stringBuilder.append(element.getPrice() + CURRENCY);
            stringBuilder.append(" | Brand: ");
            stringBuilder.append(element.getBrand());
            stringBuilder.append(" | Weight: ");
            stringBuilder.append(element.getItemWeight() + weight);
            stringBuilder.append("\n");
            stringBuilder.append(" | Length: ");
            stringBuilder.append(element.getItemLength() + MEASURE);
            stringBuilder.append(" | Height: ");
            stringBuilder.append(element.getItemHeight() + MEASURE);
            stringBuilder.append(" | Color: ");
            stringBuilder.append(element.getItemColor());
            stringBuilder.append(" | Storage amount: ");
            stringBuilder.append(element.getStorageAmount());
            stringBuilder.append(" | Category: ");
            stringBuilder.append(element.getItemCategory());
            stringBuilder.append("\n");
            stringBuilder.append(BORDER);
            System.out.println(stringBuilder.toString());
        }
    }

    /**
     * Prints out the total number of items in the storage.
     *
     * @param itemsInTheStorage number of items.
     */
    public void totalNumberOfItems(int itemsInTheStorage)
    {
        System.out.println("Total number of items in storage: " + itemsInTheStorage);
    }

    /**
     * Lets the user add a new item by user input.
     *
     * @return the added item.
     */
    public Item addNewItem()
    {
        System.out.println(BORDER);
        System.out.println("Warning! If you add a new item with an identical item number"
                + " as an existing item, the existing item will be replaced with"
                + " the one you add.");
        System.out.println(BORDER);

        System.out.println("Write the Item Number: ");
        String itemNumber = userInput.stringReader();

        System.out.println("Write the Item Description: ");
        String itemDescription = userInput.stringReader();

        System.out.println("Write the Item Price (the price is in" + CURRENCY + ") : ");
        int price = userInput.intReader();

        System.out.println("Write the Item Brand: ");
        String brand = userInput.stringReader();

        System.out.println("Write the Item Weight (the weight is in" + weight + ") : ");
        double itemWeight = userInput.doubleReader();

        System.out.println("Write the Item Length (the length is in" + MEASURE + ") : ");
        double itemLength = userInput.doubleReader();

        System.out.println("Write the Item Height (the height is in" + MEASURE + ") : ");
        double itemHeight = userInput.doubleReader();

        System.out.println("Write the Item Color: ");
        String itemColor = userInput.stringReader();

        System.out.println("Write the Storage Amount: ");
        int storageAmount = userInput.intReader();

        System.out.println("Write the Item Category: ");

        CategoryEnum itemCategory = userInput.category();

        Item item = new Item(itemNumber, itemDescription,
                price, brand, itemWeight, itemColor, itemCategory);
        item.setItemLength(itemLength);
        item.setItemHeight(itemHeight);
        item.setStorageAmount(storageAmount);

        printSearchedItem(item);
        itemRegister.addItem(item);
        System.out.println("The item has been added to the storage.");
        System.out.println(BORDER);
        return item;
    }


    //Delete
    /**
     * Menu for deleting an item, tells the user to type the item they wish to delete.
     */
    public void deleteMenu1()
    {
        System.out.println("Please type the item number of the item you want to delete.");
        System.out.println(CASESENSITIVEYES);
        System.out.println(BORDER);
    }

    /**
     * Confirmation to deletion of an item, to make sure the user is sure.
     */
    public void deleteMenu2()
    {
        System.out.println("Are you sure you want to delete this item?");
        System.out.println("Type ´YES´ to confirm or ´NO´ to cancel.");
        System.out.println(BORDER);
    }

    /**
     * Print after an item has not been deleted.
     */
    public void deleteMenu3()
    {
        System.out.println("The item has NOT been deleted.");
    }

    /**
     * Prints out that the item has been deleted if it exists, and if not, it prints that
     * the item does not exist.
     *
     * @param wantedDelete is the item you wish to delete.
     */
    public void deleteMenu4(Item wantedDelete)
    {
        if (wantedDelete != null)
        {
            System.err.println("The item has been deleted.");
        } else
        {
            System.err.println("The item you wish to delete does not exist.");
        }
    }


    //Errors
    /**
     * Prints out and error message that the user has to write a valid command.
     */
    public void enterValid()
    {
        System.err.println("Please enter a valid command.");
    }

    /**
     * Prints out an error message that the storage amount cannot be less than 0.
     */
    public void notPossible()
    {
        System.err.println("The storage amount cannot be less than 0.");
    }

    /**
     * Prints out information to the user that the item they searched, does not exist.
     */
    public void noItem()
    {
        System.err.println("The item does not exist.");
    }

    /**
     * Prints out information to the user that the input was not accepted.
     */
    public void error()
    {
        System.err.println("The input was not accepted. Please read the instructions clearly.");
    }


    //Inventory
    /**
     * Prints out the menu that asks the user for their input.
     */
    public void inventoryMenu()
    {
        System.out.println("Type the item number of the item you wish to "
                + "increase or decrease the amount of.");
        System.out.println(CASESENSITIVEYES);
        System.out.println(BORDER);
    }

    /**
     * Prints out the menu that asks the user for their input.
     */
    public void inventoryMenu2()
    {
        System.out.println("How much do you wish to increase or decrease?");
        System.out.println("(To increase, just type the number, to decrease, include a ´-´ first.");
        System.out.println(BORDER);
    }


    //Price
    /**
     * Prints out the menu that asks the user for their input.
     */
    public void priceChangeMenu()
    {
        System.out.println("Please type the item number of the item you wish to change the price.");
        System.out.println(CASESENSITIVEYES);
        System.out.println(BORDER);
    }

    /**
     * Prints out the menu that asks the user for their input.
     */
    public void priceChangeMenu2()
    {
        System.out.println("What would you like to change the price to?");
        System.out.println(BORDER);
    }


    //Coupon
    /**
     * Prints out the menu that asks the user for their input.
     */
    public void couponMenu()
    {
        System.out.println("Please type the item number of"
                + "the item you wish to add a discount to.");
        System.out.println(CASESENSITIVEYES);
        System.out.println(BORDER);
    }

    /**
     * Prints out a menu that asks for the user input.
     */
    public void couponMenu2()
    {
        System.out.println("How much would you like to discount?");
        System.out.println("The number you type will converted to percentage.");
        System.out.println("(You cannot give a percentage below 0 or above 100)");
        System.out.println(BORDER);
    }

    //Description
    /**
     * Prints out the menu that asks the user for their input.
     */
    public void descriptionChangeMenu()
    {
        System.out.println("Please type the item number of the "
                + "item you wish to change the description.");
        System.out.println(CASESENSITIVEYES);
        System.out.println(BORDER);
    }

    /**
     * Prints out the menu that asks the user for their input.
     */
    public void descriptionChangeMenu2()
    {
        System.out.println("What would you like to change the description to?");
        System.out.println(BORDER);
    }


    //Exit
    /**
     * Prints information to the user that the application is closing.
     */
    public void exit()
    {
        System.out.println("Thank you for using the Warehouse Management System!");
        System.out.println("Exiting application...");
    }

    /**
     * Prints a menu that informs the user that they are back to the main menu.
     */
    public void back()
    {
        System.out.println("You are now back to the main menu.");
        System.out.println("Type ´EXIT´ to exit the application, or type a command to continue.");
        System.out.println("Do you not remember the available commands?");
        System.out.println("Type ´MENU´ or ´HELP´");
        System.out.println(CASESENSITIVENO);
        System.out.println(BORDER);
    }

    /**
     * Default items in the item storage.
     */
    public void defaultItems()
    {
        Item item1 = new Item("A1B1C1", "Door", 700,
                "Dior", 48.8, "Walnut", CategoryEnum.DOORS);
        item1.setItemLength(1.9);
        item1.setItemHeight(1.6);
        item1.setStorageAmount(10);
        itemRegister.addItem(item1);
        Item item2 = new Item("A2B1C1", "Door", 670,
                "Dior", 47.8, "Mocha", CategoryEnum.DOORS);
        item2.setItemLength(1.5);
        item2.setItemHeight(1.7);
        item2.setStorageAmount(5);
        itemRegister.addItem(item2);
        Item item3 = new Item("A1B2C1", "Floor laminate", 900,
                "Gucci", 47.8, "Mahogany", CategoryEnum.FLOOR_LAMINATES);
        item3.setItemLength(1.5);
        item3.setItemHeight(1.7);
        item3.setStorageAmount(20);
        itemRegister.addItem(item3);
        Item item4 = new Item("A1B1C2", "Window", 600,
                "Burberry", 47.8, "Winter mood", CategoryEnum.WINDOWS);
        item4.setItemLength(1.5);
        item4.setItemHeight(1.7);
        item4.setStorageAmount(15);
        itemRegister.addItem(item4);
        Item item5 = new Item("A2B2C2", "Lumber", 1850,
                "Ralph Lauren", 47.8, "Cedar", CategoryEnum.LUMBER);
        item5.setItemLength(1.5);
        item5.setItemHeight(1.7);
        item5.setStorageAmount(10);
        itemRegister.addItem(item5);
    }
}
