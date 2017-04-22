package java1702.javase.basic.exam;

/**
 * Created by heishuai.china.cn
 * 2017/4/22 9:10
 * JAVASE
 */
public class JAVA1 {
    public static void main(String args[]) {
        String[] str = {"1", "2"};
        try {
            System.out.println(str[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        }
    }
}