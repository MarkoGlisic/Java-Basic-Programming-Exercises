package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite reistarsku oznaku: ");
        String tablica = s.nextLine();

        ispravnaRegistarskaTablica(tablica);

        if (ispravnaRegistarskaTablica(tablica)) {
            System.out.println("Uneta tablica je ispravna!");
        } else {
            System.out.println("Uneta tablica nije ispravna!");
        }
    }

    public static boolean ispravnaRegistarskaTablica(String tablica) {
        if (tablica.length() != 9) {
            return false;
        }

        if (!daLiJeDozvoljenoSlovo(tablica.charAt(0)) || !daLiJeDozvoljenoSlovo(tablica.charAt(1)) ||
            !daLiJeDozvoljenoSlovo(tablica.charAt(7)) || !daLiJeDozvoljenoSlovo(tablica.charAt(8))) {
            return false;
        }

        if (tablica.charAt(2) != '-' || tablica.charAt(6) != '-') {
            return false;
        }

        if (!Character.isDigit(tablica.charAt(3)) || !Character.isDigit(tablica.charAt(4)) || !Character.isDigit(tablica.charAt(5)) ) {
            return false;
        }
        return true;
    }

    public static boolean daLiJeDozvoljenoSlovo (char slovo) {
        if (slovo == 'A' || slovo == 'B' || slovo == 'C' || slovo == 'D' || slovo == 'E' || slovo == 'F' ||
            slovo == 'G' || slovo == 'H' || slovo == 'I' || slovo == 'J' || slovo == 'L' || slovo == 'M' ||
            slovo == 'N' || slovo == 'O' || slovo == 'P' || slovo == 'R' || slovo == 'S' || slovo == 'T' ||
            slovo == 'U' || slovo == 'V' || slovo == 'W' || slovo == 'X' || slovo == 'Y' || slovo == 'Z' ||
            slovo == 'Š' || slovo == 'Đ' || slovo == 'Ž' || slovo == 'Č' || slovo == 'Ć') {
            return true;
        } else {
            return false;
        }
    }

}

