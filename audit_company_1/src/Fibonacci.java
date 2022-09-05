import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số bạn muốn giới hạn:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Dãy số fibonacci: ");
//        System.out.println("");
//        int fibo = scanner.nextInt();

        for (int i = 0; i < i+2; i++) {
            if (fibonacci(i)< number){
                System.out.println(fibonacci(i));
            }else {
                break;
            }

        }


    }
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}
