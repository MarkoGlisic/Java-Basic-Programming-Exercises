package com.company;

import java.sql.SQLOutput;
import java.util.Random;

public class Receipt {
    private String storeName,storeAddressAndNumber,city,date,time,cashierName;
    private int transactionNumber;

    private Item[] items = new Item[50];
    private int nextItem = 0;

    public Receipt(String storeName, String storeAddressAndNumber, String city, String date, String time, String cashierName) {
        this.storeName = storeName;
        this.storeAddressAndNumber = storeAddressAndNumber;
        this.city = city;
        this.date = date;
        this.time = time;
        this.cashierName = cashierName;

        Random random = new Random();
        this.transactionNumber = random.nextInt(1000000);
    }

    public void addItem(Item item) {
        items[nextItem] = item;
        nextItem++;
    }

    private void printSeparator(int receiptWidth){
        for(int i = 0; i < receiptWidth / 2 ; i++) {
            System.out.print("= ");
        }
        System.out.println("");
    }

    public void printReceipt(int receiptWidth) {
        //50 is max width of the receipt

        System.out.println("Store: " + storeName);
        System.out.println(storeAddressAndNumber + ", " + city);
        printSeparator(receiptWidth);

        System.out.println("Date: " + date);
        System.out.println("Time:" + time);
        printSeparator(receiptWidth);

        double sum = 0.;


        for(int i = 0; i < nextItem; i++){
            items[i].printItem(receiptWidth);
            sum += items[i].getItemPrice();
        }
        printSeparator(receiptWidth);

        double taxes = sum * 0.2;
        double sumWithoutTaxes = sum - taxes;

        int widthReservedForItemName = receiptWidth - 13;
        String format1 = "%%-%ds%%12.2f\n";
        String format2 = String.format(format1,widthReservedForItemName);

        System.out.printf(format2, "Total without taxes:", sumWithoutTaxes);
        System.out.printf(format2, "Taxes:", taxes);
        System.out.printf(format2, "Total:", sum);
        printSeparator(receiptWidth);

        System.out.println("Cashier: " + cashierName);
        System.out.println("Transaction number: " + transactionNumber);
    }
}
