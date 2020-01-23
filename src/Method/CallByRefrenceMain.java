
package Method;

public class CallByRefrenceMain {
    public static void main(String[] args) {
        CallByRefrece ob = new CallByRefrece();
        ob.name = "Tamim";
        System.out.println("Before Calling = "+ob.name);
        ob.add(ob);
        System.out.println("After Calling = "+ob.name);
    }
}
