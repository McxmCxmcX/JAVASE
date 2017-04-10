package exam;

/**
 * Created by heishuai.china.cn
 * 2017/4/8 13:36
 * JAVASE
 */
//接受用户输入的一个字符串，将其每个字节的数据相加求和输出
public class K1 {
    public static void main(String[] args) {

        String a = "中文字符串";
        int total = 0;
        for (int i = 0; i < a.length(); i++) {
            int v = (int) a.charAt(i);
            int h = 10;
            int l = v;
            total += h + l;
            System.out.println("v=" + v + "(" + h + " * 100 + " + l + ")");
        }
        System.out.println(total);
    }
}

