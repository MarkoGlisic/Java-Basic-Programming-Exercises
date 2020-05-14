package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public enum smer {OPADAJUCI, RASTUCI};

    public static void sortiranjeNiza(double[] niz, smer s) {
        int n = niz.length;
        if (s == smer.RASTUCI) {
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-1; j++) {
                    if (niz[j] > niz[j+1]) {
                        double privremeno = niz[j];
                        niz[j] = niz [j+1];
                        niz[j+1] = privremeno;
                    }
                }
            }
        } else if (s == smer.OPADAJUCI) {
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-1; j++) {
                    if (niz[j] < niz[j+1]) {
                        double privremeno = niz[j];
                        niz[j] = niz [j+1];
                        niz[j+1] = privremeno;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu niza: ");
        int n = s.nextInt();
        double[] niz = new double[n];

        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite broj za niz: ");
            niz[i] = s.nextInt();
        }


        sortiranjeNiza(niz, smer.OPADAJUCI);
        System.out.println("Navedeni niz sortiran opadajuce: ");
        System.out.println(Arrays.toString(niz));

        sortiranjeNiza(niz, smer.RASTUCI);
        System.out.println("Navedeni niz sortiran rastuce: ");
        System.out.println(Arrays.toString(niz));


        
    }
}

