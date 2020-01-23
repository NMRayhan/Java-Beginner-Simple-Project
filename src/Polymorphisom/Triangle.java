
package Polymorphisom;

public class Triangle extends Shape {
    int heidth,weidth;

    public Triangle(int heidth, int weidth) {
        this.heidth = heidth;
        this.weidth = weidth;
    }
    
    @Override
    double area(){
        return .5*heidth*weidth;
    }
}
