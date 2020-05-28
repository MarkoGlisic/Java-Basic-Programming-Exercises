package com.company;

public class Main {

    public static void main(String[] args) {
        Receipt receipt = new Receipt("Store One","Street 123", "New York","2017-12-05","17:00", "John Smith");

        receipt.addItem(new Item("Item 1", 99.95));
        receipt.addItem(new Item("Item 2", 150));
        receipt.addItem(new Item("Item 3", 2220));
        receipt.addItem(new Item("Item 3 with long name so we can test the name shorter", 20));
        receipt.printReceipt(40);
    }
}
