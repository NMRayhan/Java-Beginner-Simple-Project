package java_begainning;

import java.util.Scanner;

public class Matrix_digona_sum_upper__and_lower_triagle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A[][] = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A [%d] [%d] ", row, col);
                A[row][col] = input.nextInt();
            }
        }
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sum = sum + A[row][col];
                }
                if (row < col) {
                    sum2 = sum2 + A[row][col];
                }
                if (row > col) {
                    sum3 = sum3 + A[row][col];
                }
            }
        }
        System.out.println("Sum of Diagonal Matrix is " + sum);
        System.out.println("Sum of Upper Trianguler Matrix is " + sum2);
        System.out.println("Sum of Lowe Trianguler Matrix is " + sum3);
    }
}
