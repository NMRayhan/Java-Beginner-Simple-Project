
package ThisKeyWord;

public class person {
    String name,bloodgroup,haircolor;
    int age;
    double height,weight;


    public person(String bloodgroup,String name, int age, double height, double weight) {
        this.bloodgroup = bloodgroup;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public person(String haircolor,String bloodgroup,String name,int age,double height,double weight) {
        this(bloodgroup,name,age,height,weight);
        this.haircolor = haircolor;
    }
    
    void display(){
        
        System.out.println("Name = "+name);
        System.out.println("Blood Group = "+bloodgroup);
        System.out.println("Hair Color = "+haircolor);
        System.out.println("Age = "+age);
        System.out.println("Height = "+height+" ichi");
        System.out.println("Weight = "+weight+" KiloGram");
    }
    void display(String n){
        System.out.println("This Display Method in no Method Sing");
    }
    void display(String m,String k){
        System.out.println(m+k);
    }
}
