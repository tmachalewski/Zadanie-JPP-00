package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your weight in kg?");
        float weight = sc.nextFloat();
        System.out.println("What is your height in m?");
        float height = sc.nextFloat();
        float bmi=bmi(weight, height);
        System.out.println("Your bmi is "+bmi+"that quallifies as "+bmiDescriptive(bmi));

    }

    private static String bmiDescriptive(float bmi) {
        if(bmi<18.5) return "Underweight";
        else if(bmi<25) return "Normal (healthy weight)";
        else return "Overweight";
    }

    private static float bmi(float weight, float height) {
        return weight/(height*height);
    }
}
