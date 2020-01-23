
package string;

public class StringDemo {
    public static void main(String[] args) {
        
        String n1 = new String("Nur Mohammad Rayhan");
        
        String n2 = "";
        
        System.out.println("N1 length is "+n1.length());
        if(n1.equalsIgnoreCase(n2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not-Equals");
        }
        if(n1.contentEquals(n2)){
            System.out.println("True");
        }else{
            System.out.println("Not True");
        }
        boolean con = n1.contains(" ");
        System.out.println(con);
        boolean cons = n2.isEmpty();
        System.out.println(cons);
        char s = n1.charAt(18);
        System.out.println(s);
    }
}
