package ThisKeyWord;

public class personmain {

    static void con() {
        person ob = new person("O+", "Rayhan", 22, 70, 82);
        ob.display();
        System.out.println("\n");
        person ob1 = new person("Black","O-", "Rayhan", 22, 70, 82);
        ob1.display();
        String m ="This is ";
        String k ="2nd Method";
        String n = "this is Display Method";
        ob1.display(n);
        ob1.display(m, k);
    }

    public static void main(String[] args) {
        con();
    }
}
