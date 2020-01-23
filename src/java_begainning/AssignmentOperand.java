
package java_begainning;

import java.util.Scanner;

public class AssignmentOperand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        
        System.out.printf("Enter First Number ");
        a = input.nextInt();
        
        System.out.printf("Enter Second Number ");
        b = input.nextInt();
        
        a+=b;
        System.out.println("Sum is "+a);
        
        a-=b;
        System.out.println("Subtraction is "+a);
        
        a*=b;
        System.out.println("Multiplication is "+a);
        
        a/=b;
        System.out.println("Devided is "+a);
        
        a%=b;
        System.out.println("Remaind is "+a);
    }
}
