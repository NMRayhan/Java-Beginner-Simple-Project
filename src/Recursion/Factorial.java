
package Recursion;

public class Factorial {
    int fact(int i){
        if(i==1)
            return 1;
        else
            return i*fact(i-1);
    }
}
