
package java_begainning;

import java.util.Scanner;


public class Armostrong_number {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num,temp,r,sum=0;
        
        System.out.print("Enter A number ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp!=0){
            r = temp % 10;
            int n = r*r*r;
            sum = sum + n;
            temp = temp / 10;
        }
        if(sum == num){
            System.out.println("Armostrong Number");
        }
        else{
            System.out.println("Not a Armostrong Number");
        }
    }
}
