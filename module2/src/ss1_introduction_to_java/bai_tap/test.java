package ss1_introduction_to_java.bai_tap;

import java.text.NumberFormat;
import java.util.Locale;

public class test {
    public static void main(String[] args) {
        long vnd = 10000000L;
        Locale localeVN = new Locale("vi","VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(vnd);
        System.out.println("Số " + vnd + " sau khi định dạng = " + str1);

    }
}
