package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class MoTaThuatToanInsertSort {
    private static int[] list = {1, 3, 7, 8, 5, 2, 0, 1, -9};

    public static void insertSort(int[] insertSort){
        int pos;
        int temp;
        for (int i = 1; i < insertSort.length; i++) {
            temp = insertSort[i];
            pos = i;
            while (pos >0 && temp < insertSort[pos-1]){
                insertSort[pos] = insertSort[pos-1];
                pos--;
            }
            insertSort[pos]= temp;
            System.out.println("lần thứ "+i+": "+ Arrays.toString(insertSort));
        }

        for (int i = 0; i < insertSort.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {

        insertSort(list);
    }
}
