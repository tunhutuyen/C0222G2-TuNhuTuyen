
import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String args[]) {
        Date day = new Date(2022-1900,1,1);
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss a zzz");

        System.out.println("Date hien tai: " + ft.format(dNow));
        System.out.println("Date hien tai: " + ft.format(day));
    }
}
