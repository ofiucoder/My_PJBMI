package dev.ofiucoder.pjbmi.view;

import java.util.Scanner;

public class BmiView {

    private Scanner scanner = new Scanner(System.in);

    
    public double inWeight(){
        System.out.println("Enter your weight in kilograms ");
        return scanner.nextDouble();
    }

    public double inHeight(){
        System.out.println("----------------------------");
        System.out.println("Enter your height in meters ");
        return scanner.nextDouble();
    }

}
