package ss14_thuat_toan_sap_xep.thuc_hanh;

public class SettingAlgorithmBubbleSort {
    private static int[] list = {2,4,1,1,5,6,1,-2,5,11,15};


    public static void bubleSort(int[] list){
        boolean needPassNext = true;
        for (int i = 1; i < list.length && needPassNext; i++) {
            needPassNext = false;
            for (int j = 0; j < list.length -i; j++) {
                if (list[j]> list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needPassNext = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
