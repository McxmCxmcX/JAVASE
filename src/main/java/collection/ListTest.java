package collection;
import java.util.*;

import java.util.Collection;

/**
 * Created by heishuai.china.cn
 * 2017/3/31 11:28
 * JAVASE
 */
//public class ListTest {
//    public static void main(String[] args) {
//        //Iterable 可迭代的
//        //Collection 集合  继承了 iterable
//        // list 列表       集成了 collection
//        //set 集合      继承了collection
//        //map 映射
//
//    }
//}
public class ListTest {
    public static void main(String[] args) {
        // array 数组\ [ə'reɪ]
        // list 列表\ [lɪst]
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("hello");
        System.out.println(strings.size());
        System.out.println(strings.get(1));
        System.out.println(strings.contains("test"));
        System.out.println(strings.indexOf("hello"));
        System.out.println(strings.lastIndexOf("hello"));
//        strings.clear();
        System.out.println(strings.isEmpty());
        System.out.println(strings.remove(1));
        System.out.println(strings.set(0, "test"));
        Object[] objects = strings.toArray();
        strings.add("hello");
        System.out.println(strings.size()); // 3
        System.out.println(strings); // [test, hello, hello]
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("hello");
        strings1.add("test");
        strings.removeAll(strings1);
        System.out.println(strings.size()); // 1
        System.out.println(strings); // [test]
    }
}
