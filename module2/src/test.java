import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;
public class test {
    public static void main(String[] args) throws IOException {
//        String str = "hello words hello people and hello words";
//        str = str.replaceAll(",","");
//        String[] arr = str.split(" ");
//        String key;
//        Integer value;
//        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
//        for(int i=0;i<arr.length;i++){
//            key = arr[i];
//            if(map.containsKey(key)){
//                value = map.get(key);
//                map.remove(key);
//                map.put(key, value+1);
//            } else{
//                map.put(key, 1);
//            }
//        }
//
//        Set set=map.keySet();
//        Iterator i = set.iterator();
//
//        while(i.hasNext()){
//            key=(String)i.next();
//            System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
//        }
           // String str = "abcDefabcFQzclAcFa";
//            str = str.toUpperCase();
//
//            Map<Character, Integer> treeMap = new TreeMap<>();
//
//            for (int i = 0; i < str.length(); i++) {
//                if (!treeMap.containsKey(str.charAt(i))) {
//                    treeMap.put(str.charAt(i), 1);
//                } else {
//                    treeMap.put(str.charAt(i), (treeMap.get(str.charAt(i))+1));
//                }
//            }
        //--------------------------------------------------------------
//            String[] arrString = str.split("");
//            //List<String> arrList = arrString;
//            List<Integer> arrIndex = new ArrayList<>();
//        System.out.println(Arrays.toString(arrString));
//        for (int i = 0; i < arrString.length; i++) {
//            if (Character.isUpperCase(str.charAt(i))){
//                arrIndex.add(i);
//            }
//        }
//        System.out.println(arrIndex);
//        for (int i = 0; i < arrString.length; i++) {
//            if (){
//
//            }
//        }
        //---------copy chuỗi ---------------------------------
//        String str = new String("hello Java how are you?");
//        char[] ch = new char[5];
//        try {
//            str.getChars(1, 5, ch, 0);
//            System.out.println(ch);
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }


      //  ------dọc noi dung nhập từ bàn phím-------
//        InputStream is = System.in;
//        while (true) {
//            System.out.print("Nhập 1 ký tự: ");
//            int ch1 = is.read();
//            if (ch1 == 'q') {
//                System.out.println("Finished!");
//                break;
//            }
//            is.skip(3); // Loại bỏ 2 ký tự \r và \n
//            System.out.println("Ký tự nhận được: " + (char) ch1);
//        }


        //--------đọc nội dung file sử dụng FileInputStream-----------
//        InputStream is = new FileInputStream("data.txt");
//
//        int i = -1;
//
//        // Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
//        // Khi đọc ra giá trị -1 nghĩa là kết thúc luồng.
//        while ((i = is.read()) != -1) {
//            System.out.println((char) i);
//        }
//        is.close();

        //-------dọc nhiều byte sử dụng FileInputStream------------

//        InputStream in = new FileInputStream("data.txt");
//
//        // Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
//        // Ta dùng mảng 10 byte
//
//        byte[] bytes = new byte[10];
//        int i = -1;
//        // Đọc các byte trong luồng và gán lên các phần tử của mảng.
//        // Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
//        // Khi không còn phần tử trong luồng i sẽ = -1
//        while ((i = in.read(bytes)) != -1) {
//            // Tạo String từ các byte đọc được
//            String s = new String(bytes, 0, i);
//            System.out.println(s);
//        }
//        in.close();
//----------------------------------------------------------------------------
//        String str = "adc";
//        str = new StringBuilder(str).insert((str.length()-2),".").toString();
//        System.out.println(str);
//        String str1 = "abc 123 To anh";
//        StringBuilder str2 = new StringBuilder(str1);
//        str2.delete(3,8);
//        System.out.println(str2);
        //------------String và stringbuilder
//        String str = "namEm";
//        StringBuilder stringBuilder =new StringBuilder("namEm");
//        String str1 = new String("namEm");
//        System.out.println(str.equals(str1));
//
//        System.out.println(str.equals(stringBuilder.toString()));
//
//        System.out.println(str==stringBuilder.toString());
//
//        System.out.println(str.equals(stringBuilder));
//
//        System.out.println(str1.equals(stringBuilder));
//        System.out.println(str==str1);
//        System.out.println(str1==stringBuilder.toString());



    }
}
