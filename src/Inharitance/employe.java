
package Inharitance;

public class employe {
    static String namee;
    private String name;
    private int employeID;
    private double employeSalery;
    void setname(String n){
        name = n;
    }
    String getname(){
        return name;
    }
    void setemployeID(int id){
        employeID = id;
    }
    int getemployeID(){
        return employeID;
    }
    void setemployeSalery(double s){
        employeSalery = s;
    }
    double getemployeSalery(){
        return employeSalery;
    }
   void display(){
        System.out.println("Name = "+namee);
    }
    
}
