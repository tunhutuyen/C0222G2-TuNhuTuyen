package ss15_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static void main(String[] args) {
        TriangleExceptionCheck triangleExceptionCheck = new TriangleExceptionCheck();
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            System.out.println("Hãy nhập x: ");
            int x = scanner.nextInt();
            System.out.println("Hãy nhập y: ");
            int y = scanner.nextInt();
            System.out.println("Hãy nhập z: ");
            int z = scanner.nextInt();
            try {
                triangleExceptionCheck.checkTriangleException(x, y, z);
                flag = false;
            } catch (MyTriangleException e) {
                //e.printStackTrace();
                System.err.println(e.getMessage());
                flag = true;
            }

        } while (flag);



    }
}
