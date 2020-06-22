package day03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//字符流文件复制
public class HomeWork621 {
    public static void main(String[] args) {
        FileInputStream input_file = null;
        FileOutputStream output_file = null;
        try {
            input_file = new FileInputStream("f:\\JAVA\\hello.txt");
            output_file = new FileOutputStream("f:\\JAVA\\world.txt");
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = input_file.read(b)) != -1) {
                output_file.write(b, 0, len);
                output_file.flush();
            }
        } catch (Exception e) {
           e.printStackTrace();
            throw new RuntimeException("文件复制失败");
        } finally {
            if (output_file != null) {
                try {
                    output_file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (input_file != null) {
                        try {
                            input_file.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                            throw new RuntimeException("文件复制失败");
                        }
                    }
                }
            }
        }
    }
}