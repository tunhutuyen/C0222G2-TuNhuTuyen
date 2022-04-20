package ss13_thuat_toan_tim_kiem.thuc_hanh;

public class TimKiemNhiPhanKhongDeQuy {
    private static int[] list = {2,4,5,8,11,55,59,79,99};
    public static int binarySearch(int[] list, int key){
        int firstIndex = 0;
        int finalIndex = list.length -1;
        while (firstIndex<= finalIndex){
            int mid = (finalIndex + firstIndex)/2;
            if (key < list[mid]){
                finalIndex = mid -1;
            }else if (key > list[mid]){
                firstIndex = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80));
    }
}
