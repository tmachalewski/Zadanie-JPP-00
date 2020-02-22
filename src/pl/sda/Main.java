package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your weight in kg?");
        double weight = sc.nextDouble();
        System.out.println("What is your height in m?");
        double height = sc.nextDouble();
        double bmi=bmi(weight, height);
        System.out.println("Your bmi is "+bmi+"that quallifies as "+bmiDescriptive(bmi));
    }

    private static String bmiDescriptive(double bmi) {
        if(bmi<18.5) return "Underweight";
        else if(bmi<25) return "Normal (healthy weight)";
        else return "Overweight";
    }

    private static double bmi(double weight, double height) {
        return weight/(height*height);
    }
}
