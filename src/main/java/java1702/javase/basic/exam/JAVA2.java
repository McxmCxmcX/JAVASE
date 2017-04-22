package java1702.javase.basic.exam;

/**
 * Created by heishuai.china.cn
 * 2017/4/22 9:10
 * JAVASE
 */
public class JAVA2 {
    public static void main(String[] args) {
        try {
            String e = "hello";
            e = null;
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println();
        }
    }
}