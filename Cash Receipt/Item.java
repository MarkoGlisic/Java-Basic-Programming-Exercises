package com.company;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import static java.lang.String.format;

public class Item {
    private String itemName;
    private double itemPrice;

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public void printItem(int widthOfReceipt){
        int widthReservedForItemName = widthOfReceipt - 13;

        String shortNameForPrinting = getItemName();

        if (getItemName().length() > widthOfReceipt) {
            shortNameForPrinting = getItemName().substring(0, widthReservedForItemName - 3) + "...";
        }

        String format1 = "%%-%ds%%12.2f\n";
        String format2 = String.format(format1,widthReservedForItemName);

        System.out.printf(format2,shortNameForPrinting,getItemPrice());
    }
}
