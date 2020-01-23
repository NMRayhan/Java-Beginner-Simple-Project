
package java_begainning;

import java.util.Scanner;


public class IfElse_Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter Intreger :");
        number = input.nextInt();
        
        if(number < 0){
            System.out.printf("Negative Number\n");
        }
        else if(number > 0){
            System.out.printf("Positive Number\n");
        }
        else{
            System.out.printf("This Number is Zero\n");
        }
    }
}
