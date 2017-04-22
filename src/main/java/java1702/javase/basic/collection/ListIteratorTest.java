package java1702.javase.basic.collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by heishuai.china.cn
 * 2017/4/12 11:34
 * JAVASE
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        ListIterator<String> listIterator = strings.listIterator();
        // next
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            //            System.out.println(listIterator.nextIndex());
                            /*
 +        ---[]--[]--[]--[]--[]-|-
 +         */

            ListIterator<String> iterator = strings.listIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.nextIndex());
                iterator.add("d");
                next = iterator.next();
                System.out.println(next);
                //            listIterator.set("f");
                listIterator.remove();
            }
            System.out.println(strings);

            System.out.println("---");

            while (listIterator.hasPrevious()) {
                String prev = listIterator.previous();
                //            System.out.println(listIterator.previousIndex());
                if (prev.equals("c")) {
                    listIterator.add("f");
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previousIndex());
                        prev = iterator.previous();
                        if (prev.equals("d") && iterator.previousIndex() != 6) {
                            iterator.remove();
                            //                iterator.set("e");
                        }
                        System.out.println(prev);
                    }
                    System.out.println(strings);
                    // prev
                    // index

                    // hasNext next
                    // hasPrevious prev
                    // nextIndex
                    // previousIndex
                    // add
                    // set
                    // remove
                }
            }
        }
    }
}