package string;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l;
        System.out.println("Enter any Decimal Number");
        l = input.nextInt();
        String x = Integer.toString(l);
        System.out.println("x = "+x);
        String s ="748734";
        int k = Integer.parseInt(s);
        System.out.println("k = "+k);
        String binary = Integer.toBinaryString(k);
        String binary1 = Integer.toHexString(k);
        System.out.println("HexaDecimal = "+binary1);
        System.out.println("Binary = "+binary);
    }
}
