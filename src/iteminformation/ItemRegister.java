package iteminformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * A register that holds all the items in the storage.
 * Implements the necessary functionality to be used in the user interface.
 * Items can be searched for in the register by either item number or item description,
 * items can be added to the register and deleted from the register.
 *
 * @author 10021
 * @version 2022.10.27
 */
public class ItemRegister
{
    //Fields
    private final Map<String, Item> itemStorage;

    //Constructor
    /**
     * Constructs the item register, a HashMap that holds all the items.
     */
    public ItemRegister()
    {
        this.itemStorage = new HashMap<>();
    }

    /**
     * Item storage size, a method that returns the size of the HashMap,
     * i.e. all the items that are in the storage.
     *
     * @return The total number of items in the storage.
     */
    public int itemsInStorage()
    {
        return itemStorage.size();
    }

    /**
     * Iterator for HashMap that displays all the values in HashMap.
     *
     * @return the HashMap Iterator values.
     */
    public Iterator<Item> itemStorageIterator()
    {
        return itemStorage.values().iterator();
    }

    /**
    * Adds items to the HashMap.
    *
    * @param item is the item to be added.
    */
    public void addItem(Item item)
    {
        itemStorage.put(item.getItemNumber(), item);
    }

    /**
    * Deletes items in the HashMap, by item number.
    *
    * @param item is the item to be deleted.
    */
    public void deleteItem(Item item)
    {
        itemStorage.remove(item.getItemNumber(), item);
    }

    /**
    * Search for items in the HashMap by the item number (key).
    *
    * @param key is the item number.
    * @return the item that has been searched.
    */
    public Item searchForItemByNumber(String key)
    {
        return itemStorage.get(key);
    }

    /**
     * Search for items in the HashMap by the item description.
     * Adds the items to a list, and returns the list with the items that match
     * the search.
     *
     * @param searchWord the search word that the user inputs.
     * @return the list of items that contains the search word in the description.
     */
    public List<Item> searchForItemByDescription(String searchWord)
    {
        List<Item> itemList = new ArrayList<>();
        Iterator<Item> itr = itemStorageIterator();
        while (itr.hasNext())
        {
            Item item = itr.next();
            if (item.getItemDescription().toLowerCase().contains(searchWord))
            {
                itemList.add(item);
            }
        }
        return itemList;
    }
}
