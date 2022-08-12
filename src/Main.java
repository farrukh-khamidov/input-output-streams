import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < 12; i++) {
            Date end = calendar.getTime();
            calendar.add(Calendar.MONTH, -1);
            printStartEnd(calendar.getTime(), end);
        }
    }
    static void printStartEnd(Date start, Date end) {
        System.out.println("Start Date: " + start + ", End Date: " + end);
    }
}