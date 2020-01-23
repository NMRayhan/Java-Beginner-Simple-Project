
package TimeDemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class DateFormate {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Time = "+time);
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        String FormattedTime = time.format(formattedTime);
        System.out.println("Current Time = "+FormattedTime);
    }
}
