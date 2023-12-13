package iteminformation;

import java.util.HashMap;

/**
 * The categories an item can have, held in a HashMap.
 *
 * @author 10021
 * @version 2022.11.10
 */
public class Category
{
    HashMap<String, CategoryEnum> categories;

    /**
     * Constructor - Initialise the command words.
     */
    public Category()
    {
        categories = new HashMap<>();

        //English
        categories.put("1", CategoryEnum.FLOOR_LAMINATES);
        categories.put("2", CategoryEnum.WINDOWS);
        categories.put("3", CategoryEnum.DOORS);
        categories.put("4", CategoryEnum.LUMBER);
        categories.put("unknown", CategoryEnum.UNKNOWN);
    }

    /**
     * HashMap that holds the categories.
     *
     * @return The categories.
     */
    public HashMap<String, CategoryEnum> getCategories()
    {
        return categories;
    }
}
