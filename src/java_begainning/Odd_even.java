
package java_begainning;

import java.util.Scanner;


public class Odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.printf("Enter any positive number :");
        number = input.nextInt();
        
        if(number % 2==0){
            System.out.printf("Even Number\n");
        }
        else{
            System.out.printf("Odd Number\n");
        }
    }
}
