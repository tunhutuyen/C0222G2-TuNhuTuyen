
import ss16_io_text_file.bai_tap.doc_file_csv.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestReadAndWrite {
    private static List country;

    public static void main(String[] args) {
        //thêm string or array
        //String txt ="nguyễn anh";
        //String[] txt = {"nguyễn anh", "trần phú","nam bắc"};
        //writeFile(txt);
        // ----------------------------------------------------
        Country country1 = new Country(9,"pr","Paris");
        Country country2 = new Country(10,"HK","HongKong");
        Country country3 = new Country(11,"DL","DaiLoan");
        List<Country> countryList = new ArrayList<>();
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        writeFileList(countryList);
        System.out.println(readFile());

        System.out.println("xong");
    }
// ------------ Viết 1 chuỗi hoặc 1 mảng vào file
//    private static void writeFile(String[] txt) {
//        try {
//            FileWriter fileWriter = new FileWriter("data.txt",true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            //bufferedWriter.write(txt);
//            for (String stringElement: txt) {
//                bufferedWriter.write(stringElement);
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            fileWriter.close();
//        }catch (Exception e){
//
//        }
//    }
    public static void writeFileList(List<Country> countryList){
        try {
            FileWriter fileWriter = new FileWriter("data1.txt",true);
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(country),true));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Country c:countryList) {
                bufferedWriter.write(c.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static List<Country> readFile(){
        List<Country> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("module2/src/ss16_io_text_file/bai_tap/doc_file_csv/quocgia.csv1111111");
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while (true){
                line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                String[] stringElementLine = line.split(",");
                list.add(new Country(Integer.parseInt(stringElementLine[0]),stringElementLine[1],stringElementLine[2]));
            }
//            for (Country value:list) {
//                System.out.println(value);
//            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null){

                    bufferedReader.close();
                    System.err.println("ssssssssssssssss");
                }
                System.err.println("ooooooooooooooooooooo");
            } catch (Exception e) {
                //e.printStackTrace();
                //System.err.println("ssssssssssssssss");
            }
        }
        return list;
    }
}
