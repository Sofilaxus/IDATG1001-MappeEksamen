package input;

import iteminformation.Item;
import iteminformation.ItemRegister;
import java.util.List;
import userinterface.UserInterface;

/**
 * The menu options. Contains a switch-case that implements the user input.
 *
 * @author 10021
 * @version 2022.11.23
 */
public class MenuOptions
{
    //Fields
    private final ItemRegister itemRegister;
    private final UserInterface userInterface;
    private final UserInput userInput;

    /**
     * Constructs the scanner for the user input.
     *
     * @param itemRegister the item register
     * @param userInterface the user interface
     */
    public MenuOptions(ItemRegister itemRegister, UserInterface userInterface)
    {
        this.itemRegister = itemRegister;
        this.userInterface = userInterface;
        userInput = new UserInput();
    }


    private void search()
    {
        userInterface.searchMenu();
        CommandWordsEnum command = userInput.command();
        if (command.equals(CommandWordsEnum.IN) || command.equals(CommandWordsEnum.ID))
        {
            if (command.equals(CommandWordsEnum.IN))
            {
                userInterface.searchMenuIn();
                Item foundItemN = itemRegister.searchForItemByNumber(userInput.stringReader());
                userInterface.printSearchedItem(foundItemN);
                userInterface.back();
            }
            if (command.equals(CommandWordsEnum.ID))
            {
                userInterface.searchMenuId();
                List<Item> foundItemD = itemRegister
                        .searchForItemByDescription(userInput.stringReader());
                userInterface.printAll(foundItemD.listIterator());
                userInterface.back();
            }
        } else
        {
            userInterface.error();
            userInterface.mainMenu();
        }
    }


    private void inventory()
    {
        userInterface.inventoryMenu();
        Item foundItem = itemRegister.searchForItemByNumber(userInput.stringReader());
        if (foundItem != null)
        {
            userInterface.printSearchedItem(foundItem);
            userInterface.inventoryMenu2();
            int amount = userInput.intReader();
            while (foundItem.getStorageAmount() + amount < 0)
            {
                userInterface.notPossible();
                amount = userInput.intReader();
                userInterface.back();
            }
            if (foundItem.getStorageAmount() + amount >= 0)
            {
                foundItem.setStorageAmount(foundItem.getStorageAmount()
                        + amount);
                userInterface.printSearchedItem(foundItem);
                userInterface.back();
            }
        } else
        {
            userInterface.noItem();
            userInterface.back();
        }
    }

    private void delete()
    {
        userInterface.deleteMenu1();
        Item itemToBeDeleted = itemRegister.searchForItemByNumber(userInput.stringReader());

        if (itemToBeDeleted != null)
        {
            userInterface.printSearchedItem(itemToBeDeleted);

            userInterface.deleteMenu2();
            CommandWordsEnum commands = userInput.command();
            if (commands.equals(CommandWordsEnum.YES))
            {
                itemRegister.deleteItem(itemToBeDeleted);
                userInterface.deleteMenu4(itemToBeDeleted);
                userInterface.back();
            }
            if (commands.equals(CommandWordsEnum.NO))
            {
                userInterface.deleteMenu3();
                userInterface.back();
            }
        } else
        {
            userInterface.printSearchedItem(itemToBeDeleted);
            userInterface.mainMenu();
        }
    }

    private void description()
    {
        userInterface.descriptionChangeMenu();
        Item foundItem1 = itemRegister.searchForItemByNumber(userInput.stringReader());
        userInterface.printSearchedItem(foundItem1);
        userInterface.descriptionChangeMenu2();
        foundItem1.setItemDescription(userInput.stringReader());
        userInterface.printSearchedItem(foundItem1);
        userInterface.back();
    }

    private void coupon()
    {
        userInterface.couponMenu();
        Item foundItemD = itemRegister.searchForItemByNumber(userInput.stringReader());
        if (foundItemD != null)
        {
            userInterface.printSearchedItem(foundItemD);
            userInterface.couponMenu2();
            int userDiscount = userInput.intReader();
            foundItemD.setCoupon(userDiscount);
            if (userDiscount <= 100 && userDiscount >= 0)
            {
                userInterface.printSearchedItem(foundItemD);
                userInterface.back();
            } else
            {
                userInterface.error();
                userInterface.mainMenu();
            }
        } else
        {
            userInterface.mainMenu();   
        }
    }

    private void price()
    {
        userInterface.priceChangeMenu();
        Item foundItem2 = itemRegister.searchForItemByNumber(userInput.stringReader());
        userInterface.printSearchedItem(foundItem2);
        userInterface.priceChangeMenu2();
        foundItem2.setPrice(userInput.intReader());
        userInterface.printSearchedItem(foundItem2);
        userInterface.back();
    }

    /**
     * Makes sure the program runs without exiting until the user wishes to exit.
     */
    public void keepRunning()
    {
        boolean exit = false;
        while (!exit)
        {
            readInput();
        }
    }

    /**
     * The input reader that has a switch case.
     */
    public void readInput()
    {
        switch (userInput.command())
        {
            case PRINT:
                userInterface.printAll(itemRegister.itemStorageIterator());
                userInterface.totalNumberOfItems(itemRegister.itemsInStorage());
                userInterface.back();
                break;
            case MENU:
                userInterface.mainMenu();
                break;
            case EXIT:
                userInterface.exit();
                System.exit(0);
                break;
            case SEARCH:
                search();
                break;
            case DELETE:
                delete();
                break;
            case ADD:
                userInterface.addNewItem();
                userInterface.back();
                break;
            case INVENTORY:
                inventory();
                break;
            case CATEGORY:
                userInterface.categoryMenu();
                userInterface.back();
                break;
            case DESCRIPTION:
                description();
                break;
            case COUPON:
                coupon();
                break;
            case PRICE:
                price();
                break;
            case UNKNOWN:
                userInterface.enterValid();
                break;
        }
    }
}
