package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ "+ (i + 1) +" của mảng 1: ");
            arr[i] = scanner.nextInt();
            System.out.print("Nhập phần tử thứ "+ (i + 1) +" của mảng 2: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng 1: "+Arrays.toString(arr));
        System.out.print("\n Mảng 2: "+Arrays.toString(array));
        int[] arrayTotal = new int[10];
        for (int i = 0; i < 5; i++) {
            arrayTotal[i] = arr[i];
        }
        for (int i = 0; i < 5; i++) {
            arrayTotal[i+ array.length] = array[i];
        }
        System.out.print("\n Mảng gộp: "+Arrays.toString(arrayTotal));
    }
}
