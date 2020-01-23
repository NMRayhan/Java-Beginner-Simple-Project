
package java_begainning;

import java.util.Scanner;


public class BitwiseOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1,num2,result;
        
        System.out.printf("Enter any Two Number : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        result = num1 & num2;
        System.out.println("Num1 & Num2 equal to " +result);
        
        result = num1 | num2;
        System.out.println("Num1 | Num2 equal to " +result);
        
        result = num1 ^ num2;
        System.out.println("Num1 ^ Num2 equal to " +result);
        
        result = num1>>3;
        System.out.println("Num1>> equal to " +result);
        
        result = num1<<3;
        System.out.println("Num1<< equal to " +result);
    }
}
