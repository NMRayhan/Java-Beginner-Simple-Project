
package Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
       
        Random n = new Random();
        int RandomNumber = n.nextInt(5);
        System.out.println("Random Number = "+RandomNumber);
        int i = (int) (Math.random()*5);
        System.out.println("Random Number = "+i);
       
        LocalTime time = LocalTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        String CurrentTime = time.format(formattedTime);
        System.out.println("Current Time = "+CurrentTime);
        
        Date date = new Date();
        DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
        String CurrentDate = dateformat.format(date);
        System.out.println("Current Date "+CurrentDate);
    }
}
