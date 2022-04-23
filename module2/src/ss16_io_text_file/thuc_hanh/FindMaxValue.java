package ss16_io_text_file.thuc_hanh;

import java.util.List;

public class FindMaxValue {
    public static int findMax (List<Integer> number){
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)){
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        SearchMaxAndOutputFile searchMaxAndOutputFile = new SearchMaxAndOutputFile();
        List<Integer> numbers = searchMaxAndOutputFile.readFile("D:\\tuyen\\code-gym\\C0222G2-TuNhuTuyen\\module2\\src\\ss16_io_text_file\\number.txt");
        int maxValue = findMax(numbers);
        searchMaxAndOutputFile.writeFile("D:\\tuyen\\code-gym\\C0222G2-TuNhuTuyen\\module2\\src\\ss16_io_text_file\\result.txt",maxValue);
    }
}
