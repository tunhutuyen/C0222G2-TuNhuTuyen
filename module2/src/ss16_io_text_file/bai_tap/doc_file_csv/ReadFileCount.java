package ss16_io_text_file.bai_tap.doc_file_csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ReadFileCount {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            String line;
             bufferedReader = new BufferedReader(new FileReader("D:\\tuyen\\code-gym\\C0222G2-TuNhuTuyen\\module2\\src\\ss16_io_text_file\\bai_tap\\doc_file_csv\\quocgia.csv"));
            while ((line = bufferedReader.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String line) {
        List<String> result = new ArrayList<>();
        if (line != null) {
            String[] splitData = line.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}
