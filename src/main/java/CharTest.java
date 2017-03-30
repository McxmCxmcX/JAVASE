/**
 * Created by 石磊 on 2017/3/7.
 */
public class CharTest {
    public static void main(String[] args) {
        char c1 = 123;
        System.out.println(c1);

        char c2 = '中';
        System.out.println(c2);

        char c3 = '\123'; // 八进制 0-7 123 = 8^2*1 + 8^1*2 + 8^0*3 = 64 + 16 + 3 = 83
        System.out.println(c3);

        char c4 = '\u9fbb'; // 0-9 a-f [4E00, 9FBB]
        System.out.println(c4);

        char c5 = '\\'; // tab 水平制表符
        System.out.println(c5);

        System.out.println("a");// in - line
        System.out.println("b");// in - line
        System.out.println("c5");// in - line
        System.out.println("c");// in - line
        System.out.println("d");// in - line
    }
}
