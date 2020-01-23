
package java_begainning;

import java.util.Scanner;


public class Digit_theory {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number ");
        int num = input.nextInt();
        
        int r,sum=0;
        
        while(num!=0){
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        System.out.println("Sum of this Number is "+sum);
        
    }
}
