package ss16_io_text_file.thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SumNumberOfText {
    public void readFile(String path){
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader br = new FileReader(file);
            BufferedReader reader = new BufferedReader(br);
            String line = "";
            int sum = 0;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            br.close();
            System.out.println("tổng:" +sum);
        }catch (Exception e){
            System.err.println("ko tồn lại lỗi");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhập dường dẫn: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        SumNumberOfText read = new SumNumberOfText();
        read.readFile(path);
    }
}
