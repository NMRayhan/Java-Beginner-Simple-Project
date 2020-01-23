
package SuperKeyWord;

public class keyword1 extends KeyWord {
     int x = 20;
     void display1(){
         System.out.println(super.x);
     }
     
     void display2(){
         System.out.println(x);
     }
     @Override
     void display(){
         super.display();
        System.out.println("I am Sub Class Method");
    }
}
