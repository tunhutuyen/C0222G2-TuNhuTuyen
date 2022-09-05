import java.util.Arrays;
import java.util.Scanner;

public class FindIndexTwoNumber {
    public void findIndexTwoNumber(int n, int[] array){
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]+ array[j] == n){
                    check = true;
                    System.out.println("vị trí 2 số ngẫu nhiên cần tìm là: " +i + " và " +j);
                }
            }
        }
        if (!check){
            System.out.println("ko tồn tại");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ lớn của mảng: ");
        int number_length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number_length];
        for (int i = 0; i < number_length; i++) {
            System.out.println(" nhập mảng: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập số cần tìm:");
        int n = Integer.parseInt(scanner.nextLine());
        FindIndexTwoNumber findIndex = new FindIndexTwoNumber();
        findIndex.findIndexTwoNumber(n,arr);
    }
}
