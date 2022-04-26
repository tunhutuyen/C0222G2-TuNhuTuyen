package ss19_string_regex.bai_tap.ValidatePhoneNumber;

import java.util.Scanner;

public class checkPhoneNumber {
    private static ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện thoại: \n" +
                "(xx)-(0xxxxxxxxx)\n" +
                "x là ký tự số \n" +
                "Không chứa các ký tự đặc biệt") ;
        System.out.print("nhập sdt: ");
        String string = scanner.nextLine();
        while (!validatePhoneNumber.isMatchesPhoneNumber(string)) {
            System.out.println("tên nhập ngu nhập lại ngay: ");
            string = scanner.nextLine();
        }
        System.out.print("\n sdt hợp lệ: ");
        System.out.println(string);
    }
}
