import java.util.Arrays;
import java.util.List;

public class SortString {

    public static void main(String[] args) {
        String[] words = { "q","d","b","i","a","1","o","14","11","11111","a","l" };
        System.out.println("Chuỗi ban đầu là: ");
        System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length-1; ++i) {
            for (int j = i + 1; j < words.length; ++j) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Thứ tự các kí tự được sắp xếp là: ");
//        System.out.println(Arrays.toString(words));
    }
}
