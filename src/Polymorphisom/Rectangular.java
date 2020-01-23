
package Polymorphisom;

public class Rectangular extends Shape {
    double length,width;

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length*width;
    }

    
    
    
    
    
}
