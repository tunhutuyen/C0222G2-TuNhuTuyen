package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng bạn muốn: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Nhập vào phần tử thứ "+(i+1)+" :");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng: "+ Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i <n ; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.print("\n Giá trị nhỏ nhất trong mảng là: "+min);
    }
}
