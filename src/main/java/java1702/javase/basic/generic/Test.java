package java1702.javase.basic.generic;
import java.util.Date;
/**
 * Created by heishuai.china.cn
 * 2017/4/13 8:55
 * JAVASE
 */
public class Test<T> {


    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(1, 2));
        System.out.println(test.concat(1.2,3.4));
        System.out.println(test.concat(new Date(), new Date()));
    }
    private String concat(T x, T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
