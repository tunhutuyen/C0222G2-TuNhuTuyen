package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] name = {"hoa","nam","tuan","anh"};
        System.out.print("Enter name'student want find: ");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(inputName)){
                System.out.print("Position of the stundent is: "+ i);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.print("No find");
        }
    }


}
