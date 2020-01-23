
package java_begainning;

import java.util.Scanner;


public class Palindrome_number {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0,r;
        
        System.out.println("Enter any Possitive Number : ");
        num = input.nextInt();
        
        int temp = num;
        while(temp!=0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if(num == sum){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
