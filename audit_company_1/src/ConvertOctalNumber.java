import java.util.Scanner;

public class ConvertOctalNumber {
    int a;
    Integer b;
    public void convertOctalNumber(int number) {
        System.out.println(a);
        System.out.println(b);
        int arr[] = new int[32];
        int index = 0;
        while (number > 0) {
            arr[index++] = number % 8;
            number = number /8;
        }
        for (int i = index-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thập phân muốn chuyển đổi: ");
        int number = Integer.parseInt(scanner.nextLine());
        ConvertOctalNumber oct = new ConvertOctalNumber();
        System.out.println("Kết quả: ");
        oct.convertOctalNumber(number);
    }
}
