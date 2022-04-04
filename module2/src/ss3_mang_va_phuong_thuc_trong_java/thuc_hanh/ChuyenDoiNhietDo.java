package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        int number;
        double fahrenheit;
        double celsius;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\n Menu \n 1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit\n 0. Exit\n Chọn chế độ: ");
            number = scanner.nextInt();
            if (number > 2 || number < 0){
                System.out.println("Xin nhập đúng quy định");
            }
            switch (number){
                case 1:
                    System.out.print("Nhập fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.print("chuyển "+fahrenheit+" F "+"thành "+fahrenheitToCelsius(fahrenheit)+" C");
                    break;
                case 2:
                    System.out.print("Nhập celsius: ");
                     celsius = scanner.nextDouble();
                    System.out.print("chuyển "+celsius+" C "+"thành "+celsiusToFahrenheit(celsius)+" F");
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
            }
// ----------------------------------------------
        }while (number != 0);

    }


    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
