package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cột trong ma trận: ");
        int col = scanner.nextInt();
        System.out.print("Nhập số dòng trong ma trận: ");
        int row = scanner.nextInt();
        int[][] arrayMatrix = new int[row][col];
        System.out.print("Ma trận là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập giá trị vị trí ["+i+"]["+j+"] của mảng: ");
                arrayMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Ma trận: "+ Arrays.toString(arrayMatrix));
        int max = arrayMatrix[0][0];
        int maxIndexRow = 0;
        int maxIndexCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < arrayMatrix[i][j]){
                    max = arrayMatrix[i][j];
                    maxIndexRow = i;
                    maxIndexCol = j;
                }
            }
        }
        System.out.print("\n Phần tử trong ma trận có giá trị lớn nhất là: "
                +max+" ở vị trí ["+maxIndexRow+ "]["+maxIndexCol+"]");
    }
}
