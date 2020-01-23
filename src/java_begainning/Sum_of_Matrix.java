package java_begainning;

import java.util.Scanner;

public class Sum_of_Matrix {

    void sumofmatrix() {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];
        System.out.println("Enter A Matrix ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A [%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("Enter B Matrix ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B [%d][%d] = ", row, col);
                B[row][col] = input.nextInt();
            }
        }
        System.out.printf("A Matrix is \n");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.printf("B Matrix is \n");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + B[row][col]);
            }
            System.out.println();
        }
        System.out.printf("\n\n");
        System.out.printf("A + B = \n");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] + B[row][col];
                System.out.print("\t" + C[row][col]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Sum_of_Matrix Object = new Sum_of_Matrix();
        Object.sumofmatrix();
    }
}
