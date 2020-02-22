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
        System.out.println(bmi);

    }

    private static double bmi(double weight, double height) {
        return weight/(height*height);
    }
}
