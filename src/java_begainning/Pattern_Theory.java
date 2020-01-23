
package java_begainning;

import java.util.Scanner;


public class Pattern_Theory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Line Number ");
        int line = input.nextInt();
        
        for (int row = line; row >= 1; row--) {
            for (int colum = 1; colum <= row; colum++) {
                System.out.print(" "+colum);
            }
            System.out.println();
        }
    }
}
