package ss16_io_text_file.bai_tap.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static final String SOURCE = "D:\\tuyen\\code-gym\\C0222G2-TuNhuTuyen\\module2\\src\\ss16_io_text_file\\sourceData.txt";
    private static final String TARGET = "D:\\tuyen\\code-gym\\C0222G2-TuNhuTuyen\\module2\\src\\ss16_io_text_file\\targetData.txt";
    public static void main(String[] args) {
        writeFile(SOURCE,TARGET);
    }

    public static List<String> readFile(String sourceFile) {
        List<String> sourceFileList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                sourceFileList.add(line);
            }

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("qq gì cũng đc");
        }
        return sourceFileList;
    }

    public static void writeFile(String source, String target) {
        List<String> dataList = readFile(source);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(target, true));
            for (String string : dataList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
