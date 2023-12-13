package iteminformation;

import utility.CheckValid;

/**
 * Represents an item in the item storage.
 * Contains all information related to an item.
 * An item is uniquely identified by the item number.
 *
 * @author 10021
 * @version 2022.10.05
 */
public class Item
{
    // Fields
    private final CheckValid checkValid;
    private String itemNumber;         // item number consisting of both letters and numbers.
    private String itemDescription;    // a short text description of the item.
    private int price;                 // price of the item in a whole number.
    private String brand;              // text containing the brand from which the item is from.
    private double itemWeight;         // weight of the item described with a decimal.
    private double itemLength;         // length of the item described with a decimal.
    private double itemHeight;         // height of the item described with a decimal.
    private String itemColor;          // color of the item described with text.
    private int storageAmount;         // amount of items in storage described as a whole number.
    private CategoryEnum itemCategory; // the numbers represent the different categories.
    // For itemCategory: 1 (Floor laminates) , 2 (Windows), 3 (Doors) and 4 (Lumber).

    /**
     * This is a constructor that takes in seven parameters.
     * The constructor contains CheckValid that checks
     * the validity of the String, int and double inputs.
     *
     * @param itemNumber      is the item number consisting of both letters and numbers.
     * @param itemDescription is a short text description of the item.
     * @param brand           is a text containing the brand from which the item is from.
     * @param price           is the price of the item in a whole number.
     * @param itemWeight      is the weight of the item described with a decimal.
     * @param itemColor       is the color of the item described with text.
     * @param itemCategory    is the numbers representing different categories.
     */
    public Item(String itemNumber, String itemDescription, int price, String brand,
                double itemWeight, String itemColor, CategoryEnum itemCategory)
    {
        checkValid = new CheckValid();

        setItemNumber(itemNumber);
        setItemDescription(itemDescription);
        setBrand(brand);
        setPrice(price);
        setItemWeight(itemWeight);
        setItemColor(itemColor);
        setItemCategory(itemCategory);
    }

    // Getters and setters
    /**
     * A getter method for itemNumber. This is an accessor method that returns the
     * value of a private variable. Other classes have access to the value stored in
     * this variable without having direct access to the variable itself.
     *
     * @return returns the item number that consists of both letters and numbers.
     */
    public String getItemNumber()
    {
        return itemNumber;
    }

    /**
     * A setter method for item number. The setter methods takes a parameter
     * (such as the (String itemNumber)) and assigns it to the itemNumber variable.
     * The "this" keyword here is used to refer to the current object.
     *
     * @param itemNumber is the item number that consists of both letters and numbers.
     */
    public void setItemNumber(String itemNumber)
    {
        if (checkValid.checkString(itemNumber))
        {
            this.itemNumber = itemNumber;
        } else
        {
            this.itemNumber = "Invalid item number.";
        }
    }

    /**
     * A getter method for itemDescription.
     *
     * @return returns the itemDescription as a String.
     */
    public String getItemDescription()
    {
        return itemDescription;
    }

    /**
     * A setter method for itemDescription.
     *
     * @param itemDescription a short text description of the item.
     */
    public void setItemDescription(String itemDescription)
    {
        if (checkValid.checkString(itemDescription))
        {
            this.itemDescription = itemDescription;
        } else
        {
            this.itemDescription = "Invalid item description.";
        }
    }

    /**
     * A getter method for the price.
     *
     * @return returns the price of the item as an int.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * A setter method for price.
     *
     * @param price is the price of the item in a whole number.
     */
    public void setPrice(int price)
    {
        if (checkValid.checkInt(price))
        {
            this.price = price;
        } else
        {
            this.price = -1;
        }
    }

    /**
     * A getter method for brand.
     *
     * @return returns the brand of the item as a String.
     */
    public String getBrand()
    {
        return brand;
    }

    /**
     * A setter method for the brand of the item.
     *
     * @param brand is a text containing the brand from which the item is from.
     */
    public void setBrand(String brand)
    {
        if (checkValid.checkString(brand))
        {
            this.brand = brand;
        } else
        {
            this.brand = "Invalid brand.";
        }
    }

    /**
     * A getter method for itemWeight.
     *
     * @return returns the itemWeight as a double.
     */
    public double getItemWeight()
    {
        return itemWeight;
    }

    /**
     * A setter method for itemWeight.
     *
     * @param itemWeight is the itemWeight described with a decimal.
     */
    public void setItemWeight(double itemWeight)
    {
        if (checkValid.checkDouble(itemWeight))
        {
            this.itemWeight = itemWeight;
        } else
        {
            this.itemWeight = -1;
        }
    }

    /**
     * A getter method for itemLength.
     *
     * @return returns the itemLength as a double.
     */
    public double getItemLength()
    {
        return itemLength;
    }

    /**
     * A setter method for the itemLength.
     *
     * @param itemLength is the itemLength described with a decimal.
     */
    public void setItemLength(double itemLength)
    {
        if (checkValid.checkDouble(itemLength))
        {
            this.itemLength = itemLength;
        } else
        {
            this.itemLength = -1;
        }
    }

    /**
     * A getter method for itemHeight.
     *
     * @return returns the itemHeight as a double.
     */
    public double getItemHeight()
    {
        return itemHeight;
    }

    /**
     * Is the method for setting the itemHeight.
     *
     * @param itemHeight is the itemHeight described with a decimal.
     */
    public void setItemHeight(double itemHeight)
    {
        if (checkValid.checkDouble(itemHeight))
        {
            this.itemHeight = itemHeight;
        } else
        {
            this.itemHeight = -1;
        }
    }

    /**
     * A getter method for itemColor.
     *
     * @return returns the itemColor as a String.
     */
    public String getItemColor()
    {
        return itemColor;
    }

    /**
     * A setter method for itemColor.
     *
     * @param itemColor is the itemColor described with text.
     */
    public void setItemColor(String itemColor)
    {
        if (checkValid.checkString(itemColor))
        {
            this.itemColor = itemColor;
        } else
        {
            this.itemColor = "Invalid item color.";
        }
    }

    /**
     * A getter method for the storageAmount.
     *
     * @return returns the storageAmount as an int.
     */
    public int getStorageAmount()
    {
        return storageAmount;
    }

    /**
     * A setter method for the storageAmount.
     *
     * @param storageAmount is the storageAmount described with a whole number.
     */
    public void setStorageAmount(int storageAmount)
    {
        if (checkValid.checkInt(storageAmount))
        {
            this.storageAmount = storageAmount;
        } else
        {
            this.storageAmount = -1;
        }
    }

    /**
     * A getter method for the itemCategory.
     *
     * @return returns the itemCategory as a CategoryEnum.
     */
    public CategoryEnum getItemCategory()
    {
        return itemCategory;
    }

    /**
     * A setter method for itemCategory.
     *
     * @param itemCategory is the CategoryEnum that represents the categories as numbers.
     */
    public void setItemCategory(CategoryEnum itemCategory)
    {
        this.itemCategory = itemCategory;
    }

    /**
     * A setter method for the user discount.
     * Sets the user discount by percentage.
     *
     * @param discount is the user discount that has been calculated.
     */
    public void setCoupon(int discount)
    {
        if (checkValid.checkDiscount(discount))
        {
            float deduction = price * (float) discount / 100;
            price = price - Math.round(deduction);
        }
    }
}
