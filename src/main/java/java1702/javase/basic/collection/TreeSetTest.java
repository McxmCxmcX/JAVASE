package java1702.javase.basic.collection;
import java.util.TreeSet;
/**
 * Created by heishuai.china.cn
 * 2017/4/12 9:04
 * JAVASE
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("d");
        strings.add("c");
        strings.add("b");
        strings.add("a");
        strings.add("一");
        strings.add("二");
        strings.add("三");
        strings.add("四");

        System.out.println((int) '一');
        System.out.println((int) '二');
        System.out.println((int) '三');
        System.out.println((int) '四');

        System.out.println(strings.size());
        for (String string : strings) {
        }
    }
}