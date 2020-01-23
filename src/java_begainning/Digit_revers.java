package java_begainning;

import java.util.Scanner;

public class Digit_revers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0, r;
        System.out.print("Enter Any Number ");
        int num = input.nextInt();

        while (num != 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        System.out.println("Revers Of Number is " + sum);
    }
}
