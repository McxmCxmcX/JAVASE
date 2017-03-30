import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by heishuai.china.cn
 * 2017/3/29 13:58
 * JAVASE
 */
public class VectorTest {
    public static void main(String[] args) {


        Vector<String> vector = new Vector<>();


        vector.add("hi"); // 元素 组件
        vector.add("hello");
        vector.add("test");
        vector.add("hi");

     //   System.out.println(vector.get(0));
        System.out.println(vector.size());

        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println(vector.size());
        System.out.println(vector.capacity());
        // capacity 容量，\能力，\容积

        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(10);
        integers.add(100);
        System.out.println(integers.size());
        System.out.println(integers.capacity());
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
//        System.out.println(strings.size());
    }
}
