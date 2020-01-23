
package string;

public class StringDemo3 {
    public static void main(String[] args) {
        String country = "  I love My Country Bangladesh           ";
        
        int n1 = country.codePointAt(5);
        System.out.println("ASCII value is "+n1);
        
        char n2 = country.charAt(5);
        System.out.println("5th position charecter is "+n2);
        
        int n3 = country.indexOf("t");
        System.out.println("index of t "+n3);
        
        int n4 = country.lastIndexOf("h");
        System.out.println("index of h "+n4);
        
        String[] n5 = country.split(" ");
        for(String x: n5){
            System.out.println(x); 
        }
        
        String n6 = country.replace("y","k");
        System.out.println(n6);

        String n7 = country.trim();
        System.out.println(n7);
    }
}
