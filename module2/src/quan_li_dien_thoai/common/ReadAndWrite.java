package quan_li_dien_thoai.common;

import quan_li_dien_thoai.model.DienThoaiChinhHang;
import quan_li_dien_thoai.model.DienThoaiXachTay;
import quan_li_sinh_vien.models.Student;
import quan_li_sinh_vien.models.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String PATH_PHONEGENUNIN = "src/quan_li_dien_thoai/data/dienthoaichinhhang.csv";
    private static final String PATH_PHONEHANDLE = "src/quan_li_dien_thoai/data/dienthoaixachtay.csv";

    private static void writeDataToCsv(List<String> stringList, String pathFile, boolean flag) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writePHONEGENUNINToCsv(List<DienThoaiChinhHang> phoneGenunisList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (DienThoaiChinhHang phone : phoneGenunisList) {
            stringList.add(phone.getInfo());
        }
        writeDataToCsv(stringList, PATH_PHONEGENUNIN, flag);
    }
    public static void writePhoneHandleToCsv(List<DienThoaiXachTay> phoneHandleList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (DienThoaiXachTay phoneHandle : phoneHandleList) {
            stringList.add(phoneHandle.getInfo());
        }
        writeDataToCsv(stringList, PATH_PHONEHANDLE, flag);
    }

    //read file------------------------------------------------------------
    private static List<String> readFileCsvToList(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<DienThoaiChinhHang> readFileCsvToListPhoneGenunis() {
        List<String> stringList = readFileCsvToList(PATH_PHONEGENUNIN);
        List<DienThoaiChinhHang> phoneGenunisList = new ArrayList<>();
        DienThoaiChinhHang  phoneGenunis= null;
        for (String string : stringList) {
            String[] array = string.split(",");
            phoneGenunis = new DienThoaiChinhHang(Integer.parseInt(array[0]), array[1],Double.parseDouble(array[2]), Integer.parseInt(array[3]), array[4], array[5], array[6]);
            phoneGenunisList.add(phoneGenunis);
        }
        return phoneGenunisList;
    }
    public static List<DienThoaiXachTay> readFileCsvToListPhoneHandle() {
        List<String> stringList = readFileCsvToList(PATH_PHONEHANDLE);
        List<DienThoaiXachTay> phoneHandleList = new ArrayList<>();
        DienThoaiXachTay phoneHandle = null;
        for (String string : stringList) {
            String[] array = string.split(",");
            phoneHandle = new DienThoaiXachTay(Integer.parseInt(array[0]), array[1],Double.parseDouble(array[2]), Integer.parseInt(array[3]), array[4],array[5],array[6] );
            phoneHandleList.add(phoneHandle);
        }
        return phoneHandleList;
    }
}
