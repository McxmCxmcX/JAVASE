package java1702.javase.basic.collection;

import java.util.LinkedHashMap;

/**
 * Created by heishuai.china.cn
 * 2017/4/12 9:37
 * JAVASE
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"a");
        map.put(-1,"bcd");
        map.put(100,"e");

        System.out.println(map.size());
        System.out.println(map.get(-1));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + ">" + map.get(integer));
        }
    }
}
