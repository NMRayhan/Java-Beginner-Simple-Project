package java_begainning;
import java.util.Scanner;
public class Assignment_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;
        float result;
        System.out.print("Enter Number of a ");
        a = input.nextFloat();
        System.out.print("Enter Number of b ");
        b = input.nextFloat();
        float root = a * a + b * b;
        result = (float) Math.sqrt(root);
        System.out.println("Final Result is " + result);
    }
}
