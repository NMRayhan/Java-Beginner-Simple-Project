
package java_begainning;

import java.util.Scanner;


public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] number = new int[2][3];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Enter number[%d][%d] = ",row,col);
                number[row][col] = input.nextInt();
                System.out.println();
            }
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " +number[row][col]);
            }
            System.out.println();
        }
    }
}
