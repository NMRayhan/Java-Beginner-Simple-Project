
package SuperKeyWord;

public class Car2 extends Car1 {
    int gear;
    public Car2(String color, int weight,int g) {
        super(color, weight);
        gear = g;
    }
    @Override
    void displayinfo(){
        super.displayinfo();
        System.out.println("Gear = "+gear);
    }

    
    
}
