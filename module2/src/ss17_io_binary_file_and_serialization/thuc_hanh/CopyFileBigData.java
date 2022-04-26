package ss17_io_binary_file_and_serialization.thuc_hanh;

import java.io.*;

public class CopyFileBigData {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(new File("sourceData.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
