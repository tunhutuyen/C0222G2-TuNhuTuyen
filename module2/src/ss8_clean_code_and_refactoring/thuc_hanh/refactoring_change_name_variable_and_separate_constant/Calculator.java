package ss8_clean_code_and_refactoring.thuc_hanh.refactoring_change_name_variable_and_separate_constant;

import java.util.Scanner;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập firstOperand: ");
        int firstOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập secondOperand: ");
        int secondOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phép tính mong muốn: ");
        char operator = scanner.nextLine().charAt(0);
        System.out.println(calculate(firstOperand,secondOperand,operator));
    }
}
