
package Method;

public class Student {
    int id,h,d,k;
    static String name;
    Student(int h,int d,int k){
        this.h=h;
        this.k=k;
        this.d=d;
        
    }
    Student(int a,String b){
        this.id =a;
        name = b;
    }
    void displayinfo(){
        System.out.println("Name = "+name);
        System.out.println("ID = "+id);
    }
    
}
