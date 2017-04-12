package collection;

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
                            }
                        System.out.println(prev);
                    }
                System.out.println(strings);
        // prev
        // index
        // add
        // set
        // remove
    }
}
//喜当爹！