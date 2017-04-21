package java1702.javase.basic.io;

/**
 * Created by heishuai.china.cn
 * 2017/4/21 20:08
 * JAVASE
 */
public class ExtensionNameTest {
    public static void main(String[] args) {
        String s = "123.gif";
        System.out.println(s.substring(s.lastIndexOf('.')));
    }
}