package collection;
import java.util.Map;
        import java.util.TreeMap;
/**
 * Created by heishuai.china.cn
 * 2017/4/12 9:48
 * JAVASE
 */
public class TreeMapTest {
    public static void main(String[] args) {
                TreeMap<String, Integer> map = new TreeMap<>();
                map.put("a", 1);
                map.put("bcd", -1);
                map.put("bcde", 100);

                        System.out.println(map.size());
                System.out.println(map.get("e"));

                        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + ">" + entry.getValue());
                    }
            }
 }