package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int width = -1;
                    int height = -1;
                    while (width <= 0 || height<= 0){
                        System.out.println("Enter width: ");
                        width = scanner.nextInt();
                        System.out.println("Enter height: ");
                        height = scanner.nextInt();
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                System.out.print("*");
                            }
                            System.out.println("\n");
                        }
                    }
                    break;
                case 2:
                    int heightTriangle = -1;
                    while (heightTriangle <= 0){
                        System.out.print("Please input height > 0: ");
                        heightTriangle = scanner.nextInt();
                        for (int i = 0; i <= heightTriangle; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                        System.out.print("\n");
                        for (int i = heightTriangle; i >=0 ; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                    }
                    break;
                case 3:
                    int heightIsoscelesTriangle = -1;
                    int d = 0;
                    while (heightIsoscelesTriangle <= 0){
                        System.out.print("Please input height > 0: ");
                        heightIsoscelesTriangle = scanner.nextInt();
                        for (int i = 1; i <= heightIsoscelesTriangle; i++) {
                            for (int j = 1; j <= heightIsoscelesTriangle - i ; j++) {
                                    System.out.print(" ");
                                }
                            for (int j = 1; j <=i+d ; j++) {
                                System.out.print("*");
                                d += 2;
                            }
                            System.out.println(" ");
                        }
                    }
                    break;
                case 4:
                    choice = 0;
                    break;
                default:
                    System.out.print("Chưa chọn đúng \n");
                    break;
            }
        }
    }
}
