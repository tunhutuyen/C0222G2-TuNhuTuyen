import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat3=new SimpleDateFormat("dd MM yyyy");

        System.out.println("Nhập ngày vào: ");
        String dateInput=scanner.nextLine();
        try {
            Date date= simpleDateFormat1.parse(dateInput);
            System.out.println(simpleDateFormat1.format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
//        try {
//            Date date= simpleDateFormat2.parse(dateInput);
//            System.out.println(simpleDateFormat2.format(date));
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            Date date= simpleDateFormat3.parse(dateInput);
//            System.out.println(simpleDateFormat3.format(date));
//        } catch (ParseException e) {
//                        throw new RuntimeException(e);
//        }

        Date dateTest=new Date(1999, Calendar.OCTOBER,9);
        System.out.println(dateTest);

    }
}