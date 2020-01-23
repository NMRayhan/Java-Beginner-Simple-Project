
package java_begainning;


public class UnaryOperator {
    public static void main(String[] args) {
        int a = 15,b=20,result;
        
        result = ++b;
        System.out.println(+result);
        
        result = b++;
        result = b;
        System.out.println(+result);
        
        result = a++;//15
        System.out.println(+result);
        
        result = ++a;//17
        System.out.println(+result);
       
        result = a--;//17
        System.out.println(+result);
        
        result = --a;//15
        System.out.println(+result);
        
    }
    
}
