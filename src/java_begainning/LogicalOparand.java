
package java_begainning;

import java.util.Scanner;


public class LogicalOparand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        
        System.out.printf("Enter Latter : ");
        ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z' ){
            System.out.printf("Small Latter\n");
        }
        else if(ch>='A' && ch<='Z' ){
            System.out.printf("Capital Latter\n");
        }
        else {
            System.out.printf("No Latter\n");
        }
        
    }
}
