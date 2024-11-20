package dev.ofiucoder.pjbmi.view;

import java.util.Scanner;

public class BmiView {

    private static Scanner scanner = new Scanner(System.in);
    
        
        public static double inWeight(){
            System.out.println("Enter your weight in kilograms ");
            return scanner.nextDouble();
    }

    public static double inHeight(){
        System.out.println("----------------------------");
        System.out.println("Enter your height in meters ");
        return scanner.nextDouble();
    }

    //Mostrar datos
    public void showResults(double bmi, String clasification){
        //Devuelve el valor del bmi calculado
        System.out.printf("Your BMI is: %.2f\n\n", bmi);

        //Devolver el rango/la clasificación en la tabla del BMI
        System.out.println("Your BMI is: " + clasification);
    }
}
