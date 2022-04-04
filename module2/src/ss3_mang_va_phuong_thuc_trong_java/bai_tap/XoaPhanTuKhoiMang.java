package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,4,5,6,3,7,5,2};
        boolean flag = false;
        System.out.print("Nhập phần tử muốn tìm: ");
        int number = scanner.nextInt();
        int i;
        for (i = 0; i < array.length; i++) {
            if (number == array[i]){
                for (int j = i; j < array.length-1; j++) {
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
            }
        }
        System.out.print("In mảng mới: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
        }
    }
}
