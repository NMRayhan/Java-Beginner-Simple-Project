
package Polymorphisom;

public class Test {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Triangle(12,13);
        s[2] = new Rectangular(2,3);
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
        }
        
    }
}
