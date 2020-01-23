
package java_begainning;

import java.util.Scanner;


public class Fibonaci_number {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int first,second,fibo,number;
        System.out.print("Enter How Many Number You Want : ");
        number = input.nextInt();
        
        first = 0;
        second = 1;
        System.out.print(first +" " +second);
        
        for (int i = 3; i <= number; i++) {
            
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
        System.out.println();
    }
}
