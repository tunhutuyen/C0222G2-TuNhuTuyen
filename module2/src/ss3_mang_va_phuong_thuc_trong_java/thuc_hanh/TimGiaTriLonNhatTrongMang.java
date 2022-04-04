package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        do {
            System.out.print("enter size a array: ");
            Scanner scanner = new Scanner(System.in);
            size = scanner.nextInt();
            if (size > 10){
                System.out.println("Nhập lại size < 10 ");
            }
            array = new int [size];
            for (int i = 0; i < array.length; i++) {
                System.out.print("Nhập phần tử thứ "+(i + 1)+" : ");
                array[i] = scanner.nextInt();
            }
            System.out.print("Các phần tử của mảng là: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]){
                    max = array[i];
                }
            }
            System.out.println("\nSố lớn nhất trong mảng là "+max);
        }while (size > 10);
    }
}
