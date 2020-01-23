package java_begainning;

import java.util.Scanner;

public class ArithmeticOperand {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.printf("Enter Your First Number :");
        num1 = input.nextInt();

        System.out.printf("Enter Your Second Number :");
        num2 = input.nextInt();

        int result;

        result = num1 + num2;
        System.out.println("Sum = " + result);

        result = num1 - num2;
        System.out.println("Subtraction = " + result);

        result = num1 * num2;
        System.out.println("Multiplication = " + result);

        double result2 = (double) num1 / num2;
        System.out.println("Dividate = " + result2);

        result = num1 % num2;
        System.out.println("Reminde = " + result);
        int x =10;
        Integer y = x;
        System.out.println("Y = "+y);
        String n = Integer.toString(y);
        System.out.println("String = "+n);
        String k = "144&@";
        int j = Integer.parseInt(k);
        System.out.println("j = "+j);
        
    }
}
