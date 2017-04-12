package collection;
import com.sun.media.sound.SoftTuning;

        import java.util.*;
/**
 * Created by heishuai.china.cn
 * 2017/4/12 15:47
 * JAVASE
 */
public class ArraysTest {
    public static void main(String[] args) {
        //        String[] strings = {"a", "b", "c", "f", "d"};
                //        System.out.println(Arrays.toString(strings));
                        //        System.out.println(Arrays.binarySearch(strings, "c"));
                                //        String[] strings1 = Arrays.copyOf(strings, 5);
                                        //        System.out.println(Arrays.toString(strings1));
                                                //        System.out.println(Arrays.toString(Arrays.copyOfRange(strings, 1, 3)));
                                                        //        Arrays.sort(strings);
                                                                //        System.out.println(Arrays.toString(strings));


                                                                                                LinkedHashSet<String> strings = new LinkedHashSet<>();
                strings.add("a");
                strings.add("1");
                strings.add("c");

                //        Iterator<String> iterator = strings.descendingIterator();
                        //        while (iterator.hasNext()) {
                                //            String next = iterator.next();
                                        //            System.out.println(next);
                                                //        }
                                                        //
                                                                        List<String> strings1 = new ArrayList<>();
                strings1.addAll(strings);
                System.out.println(strings1);
                Collections.reverse(strings1);
                System.out.println(strings1);

                    }
 }