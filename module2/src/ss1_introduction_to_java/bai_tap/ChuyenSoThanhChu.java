package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn cần chuyển đổi: ");
        int number = Integer.parseInt(scanner.nextLine());
        int number1 = number / 100;
        int number2 = (number / 10) % 10;
        int number3 = number % 10;
        if (number < 0 || number > 1000) {
            System.out.println("Vui lòng nhập lại số có 3 chữ số");
        }
        switch (number1){
            case 1:
                System.out.print("one hundred");break;
            case 2:
                System.out.print("two hundred");break;
            case 3:
                System.out.print("three hundred");break;
            case 4:
                System.out.print("four hundred");break;
            case 5:
                System.out.print("five hundred");break;
            case 6:
                System.out.print("six hundred");break;
            case 7:
                System.out.print("seven hundred");break;
            case 8:
                System.out.print("eight hundred");break;
            case 9:
                System.out.print("nine hundred");break;
        }
        if (number2 == 0 && number1 != 0){
            System.out.print(" and ");
        }
        if(number2 == 1){
            switch (number3){
                case 1:
                    System.out.print("eleven");break;
                case 2:
                    System.out.print("twelve");break;
                case 3:
                    System.out.print("thirteen");break;
                case 4:
                    System.out.print("fourteen");break;
                case 5:
                    System.out.print("fifteen");break;
                case 6:
                    System.out.print("sixteen");break;
                case 7:
                    System.out.print("seventeen");break;
                case 8:
                    System.out.print("eight");break;
                case 9:
                    System.out.print("nineteen");break;
            }
        }else{
            switch (number2){
                case 2:
                    System.out.print("twenty");break;
                case 3:
                    System.out.print("thirty");break;
                case 4:
                    System.out.print("forty");break;
                case 5:
                    System.out.print("fifty");break;
                case 6:
                    System.out.print("sixty");break;
                case 7:
                    System.out.print("seventy");break;
                case 8:
                    System.out.print("eighty");break;
                case 9:
                    System.out.print("ninety");break;
            }
        }
        switch (number3){
            case 1:
                System.out.print("one");break;
            case 2:
                System.out.print("two");break;
            case 3:
                System.out.print("three");break;
            case 4:
                System.out.print("four");break;
            case 5:
                System.out.print("five");break;
            case 6:
                System.out.print("six");break;
            case 7:
                System.out.print("seven");break;
            case 8:
                System.out.print("eight");break;
            case 9:
                System.out.print("nine");break;
            default:
                System.out.print("zero");break;
        }
    }
}
