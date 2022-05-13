package quan_ly_khach_san_furama.common;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckDateException {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/YY/mmmm");

    private static Scanner scanner = new Scanner(System.in);

    public void checkAge(String string) throws MyException {
        LocalDate dateOfBirth = LocalDate.parse(string,formatter);
        LocalDate current = LocalDate.now();
        int age = Period.between(dateOfBirth,current).getYears();
        if (age>100){
            throw new MyException("Quá già - > 100 tuổi");
        }else if (age<18){
            throw new MyException("Quá nhỏ - <18 tuổi");
        }else {
            System.err.println("ok");
        }
    }
}
