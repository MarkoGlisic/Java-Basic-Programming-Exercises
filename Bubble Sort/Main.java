package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public enum direction {DESCENDING, ASCENDING};

    public static void sortiranjeNiza(double[] array, direction s) {
        int length = array.length;
        if (s == direction.ASCENDING) {
            for (int i = 0; i < length-1; i++) {
                for (int j = 0; j < length-1; j++) {
                    if (array[j] > array[j+1]) {
                        double temp = array[j];
                        array[j] = array [j+1];
                        array[j+1] = temp;
                    }
                }
            }
        } else if (s == direction.DESCENDING) {
            for (int i = 0; i < length-1; i++) {
                for (int j = 0; j < length-1; j++) {
                    if (array[j] < array[j+1]) {
                        double temp = array[j];
                        array[j] = array [j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        double[] array = new double[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the numbers: ");
            array[i] = scanner.nextInt();
        }

        sortiranjeNiza(array, direction.DESCENDING);
        System.out.println("Given numbers in descending order: ");
        System.out.println(Arrays.toString(array));

        sortiranjeNiza(array, direction.ASCENDING);
        System.out.println("Given numbers in ascending order: ");
        System.out.println(Arrays.toString(array));
    }
}

