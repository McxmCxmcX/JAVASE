package java1702.javase.basic.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by heishuai.china.cn
 * 2017/4/18 10:37
 * JAVASE
 */
public class InputStreamTest {
    public static void main(String[] args) {
                InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test");
                        inputStream = new FileInputStream("test"); // 绝对路径
            int i;
            while ((i = inputStream.read()) != -1) {
                                System.out.println(i);
                                System.out.println((char) i);
            }
                    } catch (IOException e) { // char [0, 65535]
                    } finally {
                        if (inputStream != null) {
                                try {
                                        inputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                           }
        }
    }
}