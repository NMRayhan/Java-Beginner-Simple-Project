
package Encapsulation;

public class PrivateInharitance1 extends PrivateInheritance {
    String name;
    PrivateInharitance1(int id,String ps,String name){
        super(id,ps);
        this.name=name;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("profession : "+profession);
        System.out.println("ID : "+id);
        
    }
    
}
