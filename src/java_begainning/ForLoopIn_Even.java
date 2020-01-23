
package java_begainning;

import java.util.Scanner;


public class ForLoopIn_Even {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n,m,sum = 0;
        
        System.out.print("Enter Initial Number : ");
        m = input.nextInt();
        
        System.out.print("Enter Range Number : ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println("Sum of " +m+ " to " +n+" is "+sum);
        
        int mul = 1;
        for (int i = m; i <= n; i++) {
            if(i%2==1){
            mul = mul * i;
            }
        }
        System.out.println("Multiflication of " +m+ " to " +n+" is "+mul);
    }
}
