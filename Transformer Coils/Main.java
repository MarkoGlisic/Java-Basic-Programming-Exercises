package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter transformer power: ");
        double transformerPower = s.nextDouble();
        System.out.println("Secondary Transformer Voltage: ");
        double secondaryVoltage = s.nextDouble();
        int up = 230;
        double numberOfWindings = 45 / transformerPower;

        double np = numberOfWindings * up;
        double ns = numberOfWindings * secondaryVoltage;

        System.out.println("Number of coils for primary transformer: " + np);
        System.out.println("Number of coils for secondary transformer: " + ns);
    }


}

