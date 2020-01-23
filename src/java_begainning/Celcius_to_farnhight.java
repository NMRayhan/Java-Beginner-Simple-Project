
package java_begainning;

import java.util.Scanner;


public class Celcius_to_farnhight {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        double celcious,farn;
        
        System.out.printf("Enter Farenheit ");
        farn = input.nextDouble();
        
        celcious = 0.56 * farn - 32;
        System.out.println("Celcious :" +celcious);
        
    }
    
}
