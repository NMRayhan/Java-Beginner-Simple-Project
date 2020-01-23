
package Method;

public class MethdoDemo {
    public static void main(String[] args) {
        
        Teacher teacher = new Teacher("Rayhan","Male",739734434);
        teacher.dis();
        Teacher teacher1 = new Teacher("Tamim","Male");
        teacher1.dis();
        Teacher teacher2 = new Teacher();
        teacher.dis();
        System.out.println("Square of 5 = "+teacher2.square(5));
        System.out.println("Return value = "+teacher.req(5));
        System.out.println(teacher.val("Rayhan"));
    }
}
