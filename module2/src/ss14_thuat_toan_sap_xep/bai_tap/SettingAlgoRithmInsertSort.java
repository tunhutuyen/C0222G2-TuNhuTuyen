package ss14_thuat_toan_sap_xep.bai_tap;

public class SettingAlgoRithmInsertSort {
    private static int[] listInsertSort = {-1, 3, -1,7,8, 5, 2, -1, -1, 11};

    public static void insertSort(int[] list){
        int pos;
        int temp;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            pos = i;
            while (pos >0 && temp < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos]= temp;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }

    public static void main(String[] args) {
        System.out.println("list sau khi sắp xếp là: ");
        insertSort(listInsertSort);
    }
}
