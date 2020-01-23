
package Method;

public class Teacher {
    String name,gender;
    int phone;
  
    Teacher(){
        System.out.println("No Value");
    }
    Teacher(String a,String b){
        name = a;
        gender = b;
    }
    Teacher(String a,String b,int c){
        name = a;
        gender = b;
        phone = c;
    }
    void dis(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Phone = "+phone);
    }
    int square(int value){
        return value*value;
    }
    String req(int value){
        String value1 = String.valueOf(value);
        return value1;
    }
    int val(String n){
        int p = Integer.valueOf(n);
        return p; 
    }
    
}
