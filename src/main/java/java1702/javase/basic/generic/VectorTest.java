package java1702.javase.basic.generic;

import java.util.Vector;

/**
 * Created by heishuai.china.cn
 * 2017/4/13 10:01
 * JAVASE
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();//兼容
        vector.add("test...");
        vector.add("123");
        vector.add("true");
        vector.add("456");
        vector.add("567");

        String s = vector.get(4);// Type safe
        System.out.println(s);
    }
}
