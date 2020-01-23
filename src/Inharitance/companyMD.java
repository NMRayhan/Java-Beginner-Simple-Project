
package Inharitance;

public class companyMD extends employe{
    String Qualification;
    String profession;
    void displayinformation(){
        System.out.println("Name = "+getname());
        System.out.println("ID = "+getemployeID());
        System.out.println("Salery = "+getemployeSalery());
        System.out.println("Employe Qualification = "+Qualification);
        System.out.println("Employe Profession = "+profession);
        System.out.printf("\n");
    }
    @Override
    void display(){
        System.out.println("Name = "+namee); 
    }
    
}
