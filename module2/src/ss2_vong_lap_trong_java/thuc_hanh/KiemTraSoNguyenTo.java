package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số muốn kiểm tra: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2){
            System.out.print("Không phải prime");
        }else {
            int i =2;
            boolean flag = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag){
                System.out.printf("%d là prime",number);
            }else{
                System.out.print("Không phải");
            }
        }
    }
}
