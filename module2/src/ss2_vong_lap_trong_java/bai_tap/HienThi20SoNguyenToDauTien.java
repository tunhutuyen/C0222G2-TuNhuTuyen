package ss2_vong_lap_trong_java.bai_tap;



public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int number =0;
        int count = 0;
        while (count < 20){
            boolean flag = true;
            if (number < 2){
                flag = false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
    }
}
