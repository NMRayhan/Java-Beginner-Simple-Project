
package java_begainning;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static int[] arrayrtn(){
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter Any Number ");
        number = input.nextInt();
        
        int[] array = new int[number];
        
        System.out.println("Enter " +(array.length) +" Number in this array" );
        for (int count = 0; count < array.length; count++) {
            array[count] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Ascending Order Array ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Descending Order Array ");
        for (int i = number-1; i >=0; i--) {
            System.out.println(array[i]);
        }
        return array;
    }
        
    public static void main(String[] args) {
        Sorting object = new Sorting();
        Sorting.arrayrtn();
        String[] name = {"Rayhan","Nur Nahar","Fayej Ahammed","Asma Akter","Farzana Akter","Setara Akter"};
        Arrays.sort(name);
            for (int i = name.length-1; i >=0; i--) {
                System.out.println(name[i]);
            }
    }
}
