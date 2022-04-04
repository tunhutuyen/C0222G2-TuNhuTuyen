package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int n;
        int i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
             n = Integer.parseInt(scanner.nextLine());

        } while (n <= 0);
        String[] array = new String[n];
        String[] array1 = new String[n+1];
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử "+(i+1)+" : ");
            array[i] = scanner.nextLine();
        }
        System.out.print("Mảng là : ");
        for (int j = 0; j < n; j++) {
            System.out.print(array[j]+" ");
        }


        System.out.print("\n nhập vào kí tự cần thay đổi: ");
        String text = scanner.nextLine();
        System.out.print("\n Nhập vị trí: ");
        int index = scanner.nextInt();

//        for (int j = 0; j < n; j++) {
//            if (j == index){
//                for (int k = n-1; k > j; k--) {
//                    array[k] = array[k-1];
//                }
//                array[j]=text;
//                j++;
//            }
//        }
        for (int j = 0; j < n; j++) {
            array1[j]=array[j];
            if (j == index){
                for (int k = j; k<n  ; k++) {
                    array1[k+1] = array[k];
                }
                array1[j]=text;
                j++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);
    }
}
