
package java_begainning;

import java.util.Scanner;


public class Series_ForLoop {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 1,n,m;
        
        System.out.print("Enter Initial number : ");
        m = input.nextInt();
        
        System.out.print("Enter Range Number : ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            
                sum = sum + i*i;
        }
        System.out.println(+sum);
        
        
    }
}
