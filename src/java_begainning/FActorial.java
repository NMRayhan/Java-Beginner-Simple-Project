
package java_begainning;

import java.util.Scanner;


public class FActorial {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1,num2,fact = 1;
        
        System.out.print("Enter any positive number for initialization ");
        num1 = input.nextInt();
        
        System.out.print("Enter any positive number for Range ");
        num2 = input.nextInt();
        
        for (int i = num1; i >= num2; i--) {
            
            fact = fact * i;
            
        }
        System.out.println("Factorial of " +num1 + " is " +fact);
        
        
    }
}
