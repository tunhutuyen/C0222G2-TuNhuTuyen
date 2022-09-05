import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountChar {


    static void DemKyTu(String str)
    {
//        int counter[] = new int[256];
//        int len = str.length();
//        for (int i = 0; i < len; i++)
//            counter[str.charAt(i)]++;
//        char array[] = new char[str.length()];
//        for (int i = 0; i < len; i++) {
//            array[i] = str.charAt(i);
//            int flag = 0;
//            for (int j = 0; j <= i; j++) {
//                if (str.charAt(i) == array[j])
//                    flag++;
//            }
//            if (flag == 1)
//                System.out.println("Số lần xuất hiện của " + str.charAt(i)
//                        + " trong chuỗi:" + counter[str.charAt(i)]);
//        }
        char[] arr = str.toCharArray();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (char c:arr) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args)
    {
        String str = "aaabbbaabc Acabaaa";
        System.out.println("Chuỗi là: "+ str);
        DemKyTu(str);
    }
}
