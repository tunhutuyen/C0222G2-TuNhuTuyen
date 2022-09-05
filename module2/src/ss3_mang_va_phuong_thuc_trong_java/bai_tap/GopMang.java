package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[5];
//        int[] array = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Nhập phần tử thứ "+ (i + 1) +" của mảng 1: ");
//            arr[i] = scanner.nextInt();
//            System.out.print("Nhập phần tử thứ "+ (i + 1) +" của mảng 2: ");
//            array[i] = scanner.nextInt();
//        }
//        System.out.print("Mảng 1: "+Arrays.toString(arr));
//        System.out.print("\n Mảng 2: "+Arrays.toString(array));
//        int[] arrayTotal = new int[10];
//        for (int i = 0; i < 5; i++) {
//            arrayTotal[i] = arr[i];
//        }
//        for (int i = 0; i < 5; i++) {
//            arrayTotal[i+ array.length] = array[i];
//        }
//        System.out.print("\n Mảng gộp: "+Arrays.toString(arrayTotal));


        static void DemKyTu(String str)
        {
            int counter[] = new int[256];
            int len = str.length();
            for (int i = 0; i < len; i++)
                counter[str.charAt(i)]++;
            char array[] = new char[str.length()];
            for (int i = 0; i < len; i++) {
                array[i] = str.charAt(i);
                int flag = 0;
                for (int j = 0; j <= i; j++) {
                    if (str.charAt(i) == array[j])
                        flag++;
                }
                if (flag == 1)
                    System.out.println("Số lần xuất hiện của " + str.charAt(i)
                            + " trong chuỗi:" + counter[str.charAt(i)]);
            }
        }
        String str = "Hello world";
        System.out.println("Chuỗi là: "+ str);
        DemKyTu(str);
    }
}
