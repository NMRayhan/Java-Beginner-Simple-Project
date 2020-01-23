
package java_begainning;

import java.util.Scanner;


public class Prime_Number {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num,count=0;
        
        System.out.print("Enter Any Positive Number : ");
        num = input.nextInt();
        
        for (int i = 2; i < num; i++) {
            
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime Number ");
        }
        else{
            System.out.println("Not Prime ");
        }
    }
}
