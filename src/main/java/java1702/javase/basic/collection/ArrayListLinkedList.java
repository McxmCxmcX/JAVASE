package java1702.javase.basic.collection;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Created by heishuai.china.cn
 * 2017/4/11 15:59
 * JAVASE
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

                long m1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                System.out.println(m1);
        for (int i = 0; i < 10000000; i++) {
                        arrayList.add(i + "");
                        linkedList.add(i + "");
            //            arrayList.add(i + ""); // 600 M
                                linkedList.add(i + ""); // 760 M
        }
                long m2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                System.out.println(m2);

                long time1 = System.currentTimeMillis();
                System.out.println(arrayList.remove(10000000 - 1));
                long time2 = System.currentTimeMillis();
                System.out.println(linkedList.remove(10000000 - 1));
                long time3 = System.currentTimeMillis();
                System.out.println((m2 - m1) / 1024 / 1024);

                System.out.println("arrayList: " + (time2 - time1)); // arrayList
                System.out.println("linkedList: " + (time3 - time2)); // linkedList
        //        long time1 = System.currentTimeMillis();
                //        arrayList.add(0, "test");
                        //        System.out.println(arrayList.remove(10000000 - 1));
                                //        long time2 = System.currentTimeMillis();
                                        //        System.out.println(linkedList.remove(10000000 - 1));
                                                //        linkedList.add(0, "test");
                                                        //        long time3 = System.currentTimeMillis();

                                                                        //        System.out.println("arrayList: " + (time2 - time1)); // arrayList
                                                                                //        System.out.println("linkedList: " + (time3 - time2)); // linkedList
    }
}