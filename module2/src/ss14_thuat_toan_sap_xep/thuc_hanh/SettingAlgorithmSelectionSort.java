package ss14_thuat_toan_sap_xep.thuc_hanh;

public class SettingAlgorithmSelectionSort {
    private static int[] list = {1,5,2,6,3,-6,8,9,5,0};

    public static void selectSort(int[] list) {
//        for (int i = 0; i < list.length-1; i++) {
//            int minList = list[i];
//            int currentIndex =i;
//            for (int j = 1; j <list.length ; j++) {
//                if (minList > list[j]){
//                    minList = list[j];
//                    currentIndex = j;
//                }
//            }
//            if (currentIndex != i){
//                currentIndex = list[i];
//
//            }
//        }
//    }
        //private static int[] list = {1,5,2,6,3,-6,8,9,5,0};
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void main(String[] args) {
        selectSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
