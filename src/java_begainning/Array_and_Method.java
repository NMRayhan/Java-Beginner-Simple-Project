package java_begainning;

import java.util.Scanner;

public class Array_and_Method {

    static void addArray() {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter "+i +" Index Array ");
            number[i] = input.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Sum of This Array " + sum);
    }
    public static void main(String[] args) {
        addArray();
    }
}
