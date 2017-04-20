package collection;

/**
 * Created by heishuai.china.cn
 * 2017/4/17 9:07
 * JAVASE
 */
public class Test {
    public static void main(String[] args) {
        try {

            System.out.println("hello".charAt(0));
            System.out.println((new int[]{1, 2, 3})[-1]);
            System.out.println(1 / 1); //java.lang.ArithmeticException
            System.out.println(Integer.valueOf("123"));

            String s = "hi";
            //      s = null
            System.out.println(s.toUpperCase());// java.lang.NullPointerException NPE
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("test...");
    }
}
