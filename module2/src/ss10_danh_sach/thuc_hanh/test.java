package ss10_danh_sach.thuc_hanh;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aAAa ok");
        set.add("aAAa koko");
        System.out.println(set);
        for (String s:set){
            System.out.println(s.toUpperCase()+" ");
        }

    }
}
