package java1702.javase.basic.collection;
import java.util.HashSet;
/**
 * Created by heishuai.china.cn
 * 2017/4/11 16:03
 * JAVASE
 */
public class HashsetTest {
    public static void main(String[] args) {
                HashSet<String> strings = new HashSet<>();
                strings.add("hello");
                strings.add("hi");
                strings.add("test");
                strings.add("Test");

                //        ArrayList

                                        System.out.println(strings.size());
                for (String string : strings) {
                        System.out.println(string);
                    }
            }
 }