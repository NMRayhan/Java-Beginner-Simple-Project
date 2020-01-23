
package java_begainning;

import java.util.Scanner;


public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ltr;
        
        System.out.printf("Enter Latter :");
        ltr = input.next().charAt(0);
        
        switch (ltr) {
            case 'a':
                System.out.printf("Vowel\n");
                break;
            case 'e':
                System.out.printf("Vowel\n");
                break;
            case 'i':
                System.out.printf("Vowel\n");
                break;
            case 'o':
                System.out.printf("Vowel\n");
                break;
            case 'u':
                System.out.printf("Vowel\n");
                break;
            default:
                System.out.printf("Consonant\n");
                break;
        }
    }
}
