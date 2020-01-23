
package DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date = "+date);
        DateFormat DateFormate = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate =DateFormate.format(date);
        System.out.println("dd/MM/yyyy formate date = "+currentDate);
        DateFormat dateformat = new SimpleDateFormat("YYYY/MM/dd");
        String cu = dateformat.format(date);
        System.out.println("YYYY/MM/dd formate date = "+cu);
    }
}
