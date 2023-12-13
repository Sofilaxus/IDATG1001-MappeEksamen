package input;

import java.util.HashMap;

/**
 * Recognizes commands as they are typed in by the user.
 *
 * @author 10021
 * @version 2022.11.09
 */
public class CommandWords
{
    HashMap<String, CommandWordsEnum> commands;

    /**
     * Constructor - Initialise the command words.
     */
    public CommandWords()
    {
        commands = new HashMap<>();

        //English
        commands.put("search", CommandWordsEnum.SEARCH);
        commands.put("in", CommandWordsEnum.IN);
        commands.put("id", CommandWordsEnum.ID);
        commands.put("delete", CommandWordsEnum.DELETE);
        commands.put("yes", CommandWordsEnum.YES);
        commands.put("no", CommandWordsEnum.NO);
        commands.put("exit", CommandWordsEnum.EXIT);
        commands.put("print", CommandWordsEnum.PRINT);
        commands.put("help", CommandWordsEnum.MENU);
        commands.put("menu", CommandWordsEnum.MENU);
        commands.put("inventory", CommandWordsEnum.INVENTORY);
        commands.put("add", CommandWordsEnum.ADD);
        commands.put("category", CommandWordsEnum.CATEGORY);
        commands.put("description", CommandWordsEnum.DESCRIPTION);
        commands.put("coupon", CommandWordsEnum.COUPON);
        commands.put("price", CommandWordsEnum.PRICE);
        commands.put("unknown", CommandWordsEnum.UNKNOWN);
    }

    /**
     * HashMap that contains all the commands.
     *
     * @return The commands.
     */
    public HashMap<String, CommandWordsEnum> getCommands()
    {
        return commands;
    }
}
