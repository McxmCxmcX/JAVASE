package java1702.javase.basic.io;

import javax.lang.model.element.Name;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by heishuai.china.cn
 * 2017/4/18 10:37
 * JAVASE
 */
public class InputStreamTest {
//    public static void main(String[] args) {
//        try {
//            InputStream inputStream = new FileInputStream("/Users/heishuai/Desktop/Java1702_1703.txt");
//            System.out.println(inputStream.read());  //  49 -1
//            System.out.println(inputStream.read());  //  44 -7
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        System.out.println((int)"1");
//    }
public static void main(String[] args) {

    try {
        InputStream inputStream = new FileInputStream("test");
        int i;
        while ((i = inputStream.read()) != -1) {
            System.out.println((char) i);
        }
    }catch (IOException e) {
        e.printStackTrace();

        }
    }
}

