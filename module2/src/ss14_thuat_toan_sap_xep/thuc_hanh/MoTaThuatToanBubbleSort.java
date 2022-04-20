package ss14_thuat_toan_sap_xep.thuc_hanh;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class MoTaThuatToanBubbleSort {
    public static void bubbleSort(int[] list){
        boolean flag = true;
        for (int i = 1; i < list.length && flag ; i++) {
            flag = false;
            for (int j = 0; j < list.length -i; j++) {
                if (list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                System.out.println("list ko cần sắp xếp!!!");
                break;
            }
            System.out.print("list after the: " +i+ " sort\n");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j] +"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("enter "+ list.length+ "value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random()*99+1);
        }
        System.out.println("your input list ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\t");
        }
        bubbleSort(list);
    }
}
