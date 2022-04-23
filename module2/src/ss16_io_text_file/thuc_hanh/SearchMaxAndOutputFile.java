package ss16_io_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SearchMaxAndOutputFile {
    public List<Integer> readFile(String pathFile) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException("méo có qq gì cả");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            while ((line= br.readLine()) != null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("qq gì ko!!!");
        }
        return number;
    }
    public void writeFile(String pathFile,int max){
        try {
            FileWriter writer = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất: "+ max);
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
