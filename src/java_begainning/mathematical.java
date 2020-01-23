
package java_begainning;

import java.util.Scanner;


public class mathematical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        double base,height;
        
        System.out.printf("Enter First Number :");
        a = input.nextInt();
        
        System.out.printf("Enter Second Number :");
        b = input.nextInt();
        
        int result=(a*a)+(2*a*b)+(b*b);
        System.out.println("The Result is : "+result);
        
        System.out.printf("Enter The Base on this Triangle :");
        base = input.nextDouble();
        
        System.out.printf("Enter The Height on This Triangle :");
        height = input.nextDouble();
        
        double area = .5 * base * height;
        System.out.println("Area of This Triangle " +area);
        
        
    }
}
