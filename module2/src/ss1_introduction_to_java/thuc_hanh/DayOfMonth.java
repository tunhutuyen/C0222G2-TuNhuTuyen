package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input month that you want to count day");
        int month = input.nextInt();

        String daysOfMonth;

        switch (month){
            case 2:
                daysOfMonth = "28-29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysOfMonth = "30";
                break;
            default:
                daysOfMonth = "";
                break;
        }
        if (!daysOfMonth.equals("")) System.out.printf("The month '%d' has '%s' day",month,daysOfMonth);
        else System.out.print("invalid input");
    }
}
