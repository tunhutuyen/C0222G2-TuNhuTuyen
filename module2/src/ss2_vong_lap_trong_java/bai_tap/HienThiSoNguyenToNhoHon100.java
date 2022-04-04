package ss2_vong_lap_trong_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number = 0;
        int check = 0;
        int i = 0;
        while (check < 100){
            boolean flag = true;
            if (number < 2){
                flag = false;
            }else {
                for (i = 2; i < number; i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true && number <100){
                System.out.print(number+" ");
                check = i;
            }
            number++;
        }
    }
}
