import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatApp {
    public static void main(String [] args){
        LocalDate localdate = LocalDate.of(2015,4,4);
        System.out.println(localdate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        System.out.println(localdate.format(DateTimeFormatter.ofPattern("E MMM dd, yyyy")));
        System.out.println(localdate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));

    }
}
