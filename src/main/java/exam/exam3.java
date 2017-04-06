package exam;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Created by heishuai.china.cn
 * 2017/4/1 13:47
 * JAVASE
 */
//使用键盘录入一个字符串，获取字符串中每一个字符出现的次数，要求统计结果格式为：a(5),b(4),c(3),d(2),e(1)
public class exam3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String str = sc.next();

        Map<String, Integer> map = new LinkedHashMap<>();

        int len;

        while (str.length() > 0) {

            len = str.length();

            String s = str.substring(0, 1);

            str = str.replaceAll(s, "");

            map.put(s, len - str.length());
        }

        System.out.println(map);
    }
}
