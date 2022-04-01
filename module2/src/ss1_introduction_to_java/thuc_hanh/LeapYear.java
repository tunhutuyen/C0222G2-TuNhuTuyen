package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("input year that you want to check");
        Scanner year = new Scanner(System.in);
        int year1 = year.nextInt();
//        if (year1 % 4 == 0){
//            if (year1 % 100 == 0){
//                if (year1 % 400 ==0){
//                    System.out.printf("%d is leap year",year1);
//                }else {
//                    System.out.printf("%d is not leap year",year1);
//                }
//            }else {
//                System.out.printf("%d is leap year", year1);
//            }
//        }else {
//            System.out.printf("%d is not leap year",year1);
//        }

        //Cách viết gọn code, dễ hiểu.
        boolean isLeap = false;
        boolean isDivisibleBy4 = year1 % 4 == 0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = year1 % 100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year1 % 400 == 0;
                if (isDivisibleBy400){
                    isLeap = true;
                }
            }else {
                isLeap = true;
            }
        }
        if (isLeap){
            System.out.printf("%d is a leap year",year1);
        }else {
            System.out.printf("%d is not leap year",year1);
        }


    }
}
