
package DebugDemo;

import java.util.Scanner;

public class DebugDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <=3; i++) {
            for (int j = i; j <=3; j++) {
                sum+=(i+j);
            }
        }
        System.out.println("sum = "+sum);
    }
}
