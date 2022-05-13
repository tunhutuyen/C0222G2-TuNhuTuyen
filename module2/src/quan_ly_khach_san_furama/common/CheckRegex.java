package quan_ly_khach_san_furama.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckRegex {
    private static final Scanner scan = new Scanner(System.in);
    private static final String REGEX_IDSERVICEROOM = "^(SVRO-)[0-9]{4}$";
    private static final String REGEX_IDSERVICEHOUSE = "^(SVHO-)[0-9]{4}$";
    private static final String REGEX_IDSERVICEVILLA = "^(SVVL-)[0-9]{4}$";
    private static final String REGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD = "^[A-Z][a-z\\s]+$";
    private static final String REGEX_AREAUSE_AND_AREAPOOL = "^(([3-9][0-9])|[1-9][0-9]{2,})[.]?(\\d+)?$";
    private static final String REGEX_COSTRETAL = "^[1-9](\\d+)?$";
    private static final String REGEX_NUMBERMEMBER = "^([1-9]|(1[0-9]))$";
    private static final String REGEX_NUMBERFLOOR = "^([1-9]|([1-9][0-9]+))$";
    private static final String REGEX_AAAAA = "^([1-9]|([1-9][0-9]+))$";

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public CheckRegex() {
    }

    private static String regex(String input, String regex, String error) {
        boolean flag = true;
        while (flag) {
            if (input.matches(regex)) {
                flag = false;
            } else {
                System.out.println(error);
                input = scan.nextLine();
            }
        }
        return input;
    }

    public static String isREGEX_IDSERVICEROOM() {
        System.out.println("nhập id room: ");
        return regex(scan.nextLine(), REGEX_IDSERVICEROOM, "Nhập lại Id dạng SVRO-XXXX(X là số):");
    }

    public static String isREGEX_IDSERVICEHOUSE() {
        System.out.println("nhập id house:");
        return regex(scan.nextLine(), REGEX_IDSERVICEHOUSE, "Nhập lại ID dạng SVHO-XXXX");
    }

    public static String isREGEX_IDSERVICEVILLA() {
        System.out.println("nhập id villa: ");
        return regex(scan.nextLine(), REGEX_IDSERVICEVILLA, "Nhập lại Id dạng SVVL-XXXX(X là số)");
    }

    public static String isREGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD() {
        System.out.println("nhập tên dịch vụ/ kiểu thuê/ kiểu phòng: ");
        return regex(scan.nextLine(), REGEX_NAMESERVICE_TYPERENTAL_AND_ROOMSTANDARD, "Sai!!! Nhập lại viết hoa chữ đầu:");
    }

    public static boolean isREGEX_AREAUSE_AND_AREAPOOL(String string) {
        return string.matches(REGEX_AREAUSE_AND_AREAPOOL);
    }

    public static String isREGEX_COSTRETAL() {
        System.out.println("Nhập giá thuê >0: ");
        return regex(scan.nextLine(), REGEX_COSTRETAL, "Sai!! NHập lại với >0");
    }

    public static String isREGEX_NUMBERMEMBER() {
        System.out.println("Nhập số người tối đa >0 && <20: ");
        return regex(scan.nextLine(), REGEX_NUMBERMEMBER, "Sai!!! Nhập lại với >0 và <20");
    }

    public static String isREGEX_NUMBERFLOOR() {
        System.out.println("nhập số tầng >0:");
        return regex(scan.nextLine(), REGEX_NUMBERFLOOR, "Sai!!! Nhập lại với >0");
    }

    public static String isRegexAge(String string) {
        boolean flag = true;
        while (flag) {
            try {
                int age =0;
                if(string.matches(REGEX_AAAAA)) {
                    LocalDate dateOfBirth = LocalDate.parse(string, formatter);
                     age = Period.between(dateOfBirth, LocalDate.now()).getYears();
                }if (age >= 18 && age <= 100) {
                    flag = false;
                } else {
                    throw new MyException("You very old!!! Again!!!");
                }
            } catch (MyException e) {
                System.err.println(e.getMessage());
                string = scan.nextLine();
            } catch (DateTimeParseException e) {
                System.out.println("Sai định dạng.Nhập lại số theo định dạng dd/YY/mmmm");
                string = scan.nextLine();
            }
//            } catch (Exception e) {
//                try {
//                    throw new MyException("Sai định dạng nhập vào. Nhập số theo định dạng dd/YY/mmmm");
//                } catch (MyException o) {
//                    System.err.println(o.getMessage());
//                }
//                string = scan.nextLine();
//            }
        }
        return string;
    }
}

