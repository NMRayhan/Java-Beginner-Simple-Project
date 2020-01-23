
package Inharitance;

public class test extends companyMD {
    public static void main(String[] args) {
        employe e = new employe();
        test t = new test();
        companyMD ob1 = new companyMD();
        ob1.setname("Rayhan");
        ob1.setemployeID(1213);
        ob1.setemployeSalery(30000);
        ob1.Qualification = "BSc in SWE";
        ob1.profession = "Senior Web Developer";
        ob1.displayinformation();
        
        companyMD ob2 = new companyMD();
        ob2.setname("Tamim");
        ob2.setemployeID(1133);
        ob2.setemployeSalery(25000);
        ob2.Qualification = "BSc in SWE";
        ob2.profession = "Senior Graphics Designer";
        ob2.displayinformation();
                
        companyMD ob3 = new companyMD();
        ob3.setname("Chandon");
        ob3.setemployeID(3473);
        ob3.setemployeSalery(27000);
        ob3.Qualification = "BSc in SWE";
        ob3.profession = "Senior Software Engineer";
        ob3.displayinformation(); 
        System.out.println(e instanceof employe);
        System.out.println(ob1 instanceof employe);
        System.out.println(t instanceof companyMD);
        System.out.println(t instanceof test);
        System.out.println(t instanceof employe);
        System.out.println(e instanceof test);
    }
    @Override
    void display(){
        System.out.println("Name = "+namee);
    }
}
