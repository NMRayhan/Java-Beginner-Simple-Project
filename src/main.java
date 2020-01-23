
import java.util.InputMismatchException;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        ABCShop n = new ABCShop(0," ",0.0);
        Scanner input = new Scanner(System.in);
        double s = 0;
        int num = 0;
        String n1 = input.nextLine();
        try{
            int n2 = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println(e);
        }
        try{
            s = input.nextDouble();
        }catch(InputMismatchException er){
            System.out.println(er);
        }
        System.out.println("Salery "+n.calculatesalery(s));
        System.out.println("How Many Product Alim Sells ");
        try{
            num = input.nextInt();
        }catch(InputMismatchException el){
            System.out.println(el);
        }
        System.out.println("Bonus = "+n.Bonus(num));
        System.out.println("Total Payable = "+n.total());
    }
}
