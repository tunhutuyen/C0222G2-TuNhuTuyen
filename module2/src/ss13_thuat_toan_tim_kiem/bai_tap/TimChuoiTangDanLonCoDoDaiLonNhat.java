package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;
// chuỗi có độ dài lớn nhất (ko bắt buộc phải liên tiếp)
public class TimChuoiTangDanLonCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chuỗi cần kiểm tra: ");
        String string = scanner.nextLine();
        LinkedList<Character> maxList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> listTemp = new LinkedList<>();
            listTemp.add(string.charAt(i));
            for (int j = i+1; j < string.length(); j++) {
                if (listTemp.getLast()<string.charAt(j)){
                    listTemp.add(string.charAt(j));
                }
            }
            if (listTemp.size()>maxList.size()){
                maxList.clear();
                maxList.addAll(listTemp);
            }
            listTemp.clear();
        }
        System.out.print("\n Chuỗi dài nhất là: ");
        for (Character character:maxList) {
            System.out.print(character);
        }

    }
}
