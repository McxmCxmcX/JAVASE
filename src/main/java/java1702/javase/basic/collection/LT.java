package java1702.javase.basic.collection;
import java.util.*;
/**
 * Created by heishuai.china.cn
 * 2017/4/12 15:36
 * JAVASE
 */
public class LT {
    public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<>();
                list.add("a");
                list.add("b");
                list.add("c");
                System.out.println(list);
        //        Collections.reverse(list);
                        System.out.println(list);
        //        Collections.sort(list); // sort 排序\ [sɔːt]
                        System.out.println(list);

                        System.out.println(Collections.binarySearch(list, "c")); // ?

                        Map<Integer, String> map = new HashMap<>();
                map.put(1, "a");
                map.put(2, "b");
                map.put(3, "c");

                        System.out.println(map); //

                        System.out.println(Collections.singletonList(map)); // ?
            }
 }