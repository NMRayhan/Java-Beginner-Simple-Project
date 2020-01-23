
package java_begainning;

import java.util.Scanner;


public class MathClassDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        
        System.out.printf("Enter Any Tow Number \n");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        int maximum = Math.max(num2, num1);
        System.out.println("MaxiMum Number is : "+maximum);
        
        int minimum = Math.min(num2, num1);
        System.out.println("Minimum  Number is : "+minimum);
        
        
    }
}
