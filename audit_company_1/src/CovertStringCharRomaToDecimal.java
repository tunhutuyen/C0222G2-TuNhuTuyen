import java.util.Arrays;

public class CovertStringCharRomaToDecimal {
    public void covertDecimal(String str1){
        String str = str1.toUpperCase();
        char[] arrChar = str.toCharArray();
        System.out.println(Arrays.toString(arrChar));
        int[] arrNumber = new int[str.length()];
        System.out.println("-----");
        System.out.println(arrNumber.length);
        for (int i = 0; i < str.length(); i++) {
            switch (arrChar[i]){
                case 'I': arrNumber[i]= 1;break;
                case 'V': arrNumber[i]= 5;break;
                case 'X': arrNumber[i]= 10;break;
                case 'L': arrNumber[i]= 50;break;
                case 'C': arrNumber[i]= 100;break;
                case 'D': arrNumber[i]= 500;break;
                case 'M': arrNumber[i]= 1000;break;
            }
        }
        System.out.println(Arrays.toString(arrNumber));
        int k = arrNumber[0];

        for (int i = 1; i < arrNumber.length-1; i++) {
            if ((arrNumber[i]>arrNumber[i+1]) ||(arrNumber[i]==arrNumber[i+1])){
                k += arrNumber[i];
            }else {
                k -= arrNumber[i];
            }
        }
        k += arrNumber[arrNumber.length-1];
        System.out.println("Số nguyên cần tìm là: "+ k);
    }

    public static void main(String[] args) {
        String str = "mxixv";
        CovertStringCharRomaToDecimal covert = new CovertStringCharRomaToDecimal();
        covert.covertDecimal(str);
    }
}
