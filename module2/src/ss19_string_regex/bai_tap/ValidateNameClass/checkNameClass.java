package ss19_string_regex.bai_tap.ValidateNameClass;

import java.util.Scanner;

public class checkNameClass {
    private static ValidateClass validateClass = new ValidateClass();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên lớp: \n" +
                "- Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P\n" +
                "- Không chứa các ký tự đặc biệt\n" +
                "- Theo sau ký tự bắt đầu là 4 ký tự số \n" +
                "- Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M");
        System.out.print("nhập tên lớp: ");
        String string = scanner.nextLine();
        while (!validateClass.isMatchesNameClass(string)) {
            System.out.println("tên nhập ngu nhập lại ngay: ");
            string = scanner.nextLine();
        }
        System.out.print("\n Tên lớp: ");
        System.out.println(string);
    }

}
