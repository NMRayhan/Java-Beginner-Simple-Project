
package Method;

public class MethodOverloading {
    void add(){
        System.out.println("Nothing to add");
    }
    void add(int a,int b){
        System.out.println("Sum = "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum = "+(a+b+c));
    }
    void add(double a,double b){
        System.out.println("Sum = "+(a+b));
    }
    void add(int i){
        i=20;//method always Priority in Local Variable
        System.out.println("I = "+i);
    }
    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
        ob.add();
        ob.add(3,4);
        ob.add(5,6,7);
        ob.add(3.4,5.6);
        //peramiter Call Method Signature
        int x = 10;
        System.out.println("X = "+x);
        ob.add(x);
        
    }
}
