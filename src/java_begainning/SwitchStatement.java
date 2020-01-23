
package java_begainning;

import java.util.Scanner;


public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        
        System.out.printf("Enter Any Digit : ");
        digit = input.nextInt();
        
        switch(digit){
            case 0:
                System.out.printf("Zero\n");
                break;
            case 1:
                System.out.printf("One\n");
                break;
            case 2:
                System.out.printf("Two\n");
                break;
            case 3:
                System.out.printf("Three\n");
                break;
            case 4:
                System.out.printf("Four\n");
                break;
            case 5:
                System.out.printf("Five\n");
                break;
            case 6:
                System.out.printf("Six\n");
                break;
            case 7:
                System.out.printf("Seven\n");
                break;
            case 8:
                System.out.printf("Eight\n");
                break;
            case 9:
                System.out.printf("Nine\n");
                break;
            case 10:
                System.out.printf("Ten\n");
                break;    
            default:
                System.out.printf("No Digit\n");
        }
        
    }
}
