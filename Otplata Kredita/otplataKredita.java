package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Trazenje unosa od korisnika
        System.out.print("Unesite iznos kredita: ");
	    double iznosKredita = scanner.nextDouble();
        System.out.print("Unesite rok otplate u godinama: ");
	    double rokOtplate = scanner.nextDouble();
        System.out.print("Unesite kamatnu stopu u procentima: ");
	    int kamatnaStopa = scanner.nextInt();

	    double kamata = (iznosKredita * rokOtplate * kamatnaStopa) / 100;
        System.out.println("Ukupna kamata po optlati kredita je: " + kamata);

        //Prebacivanje roka otplate u mesece
        double rokOtplateUMesecima = rokOtplate * 12;

	    double rataMesec = iznosKredita / rokOtplateUMesecima;
        System.out.println("Mesecna rata iznosi  " + rataMesec);
	    double kamataMesec = kamata / rokOtplateUMesecima;
        System.out.println("Mesecna kamata iznosi: " + kamataMesec);

        for (int i = 0; i < rokOtplateUMesecima; i++) {
            LocalDate buduciDatum = LocalDate.now().plusMonths(i);

            // Datum za uplatu ne moze biti pre 5-og i posle 25-og u mesecu
            switch (buduciDatum.getDayOfMonth()) {
                case 1:
                    System.out.println("Datum za uplatu: " + buduciDatum.plusDays(5));
                case 2:
                    System.out.println("Datum za uplatu: " + buduciDatum.plusDays(4));
                case 3:
                    System.out.println("Datum za uplatu: " + buduciDatum.plusDays(3));
                case 4:
                    System.out.println("Datum za uplatu: " + buduciDatum.plusDays(2));
                case 5:
                    System.out.println("Datum za uplatu: " + buduciDatum.plusDays(1));
                case 25:
                    System.out.println("Datum za uplatu: " + buduciDatum.minusDays(1));
                case 26:
                    System.out.println("Datum za uplatu: " + buduciDatum.minusDays(2));
                case 27:
                    System.out.println("Datum za uplatu: " + buduciDatum.minusDays(3));
                case 28:
                    System.out.println("Datum za uplatu: " + buduciDatum.minusDays(4));
                case 29:
                    System.out.println("Datum za uplatu: " + buduciDatum.minusDays(5));
                case 30:
                    System.out.println("Datum za uplatu: " + buduciDatum.minusDays(6));
                case 31:
                    System.out.println("Datum za uplatu: " + buduciDatum.minusDays(7));
                default:
                    System.out.println("Datum za uplatu: " + buduciDatum);
            }
        }
    }
}
