package java1702.javase.basic.collection;
import java.util.LinkedList;
/**
 * Created by heishuai.china.cn
 * 2017/4/11 9:46
 * JAVASE
 */
public class LinkedListTest {
    // link 链接\ [lɪŋk]
            public static void main(String[] args) {
                LinkedList<String> strings = new LinkedList<>();
                strings.add("a");
                strings.add("b");

                        System.out.println(strings.size());
                System.out.println(strings.get(0));

                        for (String string : strings) {
                        System.out.println(string);
                    }

                        System.out.println(strings.getFirst());
                System.out.println(strings.getLast());
            }
 }