
package ArrayList;

import java.util.Arrays;


public class Array {
    public static void main(String[] args) {
        char[] name = {'a','c','b','f','d','k','e'};
        String[] names={"Shorna","Rayhan","Asma","Mukkta"};
       int[] number = {2,3,5,1,-5,10,60,55,30};
       Arrays.sort(name);
       Arrays.sort(number);
       Arrays.sort(names);
        System.out.println("Ascending Order");
        for (int i = 0; i < number.length; i++) {
            System.out.print(" "+number[i]);
            
        }
        System.out.println("\n");
        for (int k = 0; k < names.length; k++) {
            System.out.print(" "+names[k]);
        }
        
        System.out.println("\n");
        for (int l = 0; l < name.length; l++) {
            System.out.print(" "+name[l]);
        }
        System.out.println("\n");
        System.out.println("Descending Order");
        for (int j = 8; j >=0; j--) {
            System.out.print(" "+number[j]);
        }
        System.out.println("\n");
    }
}
