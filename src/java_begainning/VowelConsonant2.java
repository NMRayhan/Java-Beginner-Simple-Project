
package java_begainning;

import java.util.Scanner;

public class VowelConsonant2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.printf("Enter Latter :");
        ch = input.next().charAt(0);
        
        if(ch=='a' || ch=='A'){
           System.out.printf("Vowel\n");
        }
        else if(ch=='e' || ch=='E'){
           System.out.printf("Vowel\n");
        }
        else if(ch=='i' && ch=='I'){
           System.out.printf("Vowel\n");
        }
        else if(ch=='o' || ch=='O'){
           System.out.printf("Vowel\n");
        }
        else if(ch=='u' || ch=='U'){
           System.out.printf("Vowel\n");
        }
        else{
           System.out.printf("Consonant\n");
        }
    }
}
