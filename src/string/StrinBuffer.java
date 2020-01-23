
package string;

public class StrinBuffer {
    public static void main(String[] args) {
        String s1 = "Mohammad";
        StringBuffer sb = new StringBuffer(s1);
        
        sb.append(" Rayhan ");
        sb.append(22);
        sb.append(" ");
        sb.append(3);
        System.out.println(sb);
        
        sb.setLength(4);
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);
        String n = sb.reverse().toString();
        if(s1.equals(n)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not A palindrome");
        }
        
        
        
    }
}