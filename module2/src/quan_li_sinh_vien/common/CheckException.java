package quan_li_sinh_vien.common;

import java.util.Scanner;

public class CheckException {
    private static Scanner scanner = new Scanner(System.in);

    public static Integer checkParseIntEx(Integer value) {
        boolean flag = true;
        while (flag) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.err.println("Sai!!!Hãy nhập số");
                System.out.println();
                System.out.print("Nhập lại: ");
            }
        }
        return value;
    }

    public static Double checkExForParseDouble(Double value) {
        boolean check = true;
        while (check) {
            try {
                value = Double.parseDouble(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.err.println("Error: Nhập lại");
                System.out.println();
                System.out.print("Enter again: ");
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return value;
    }
}
