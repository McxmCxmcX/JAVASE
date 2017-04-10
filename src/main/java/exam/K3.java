package exam;

/**
 * Created by heishuai.china.cn
 * 2017/4/8 13:36
 * JAVASE
 */
//编写一个java应用程序，要求如下：
//　　（1）声明一个String类的变量并初始化值“Hello World”。
//        　　（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
//        　　（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
  //      　　（4）声明一个String类的变量并初始化值“20100110”。
  //      　　（5）将上面变量的值转换成2010年1月10日的形式打印输出。
public class K3 {
    public static void main(String[] args) {

        String a;
        a = "Hello World";
        String[] b = a.split("");
        System.out.println("拆分:" + "Hello\t" + "World");
        System.out.println("Hello".toUpperCase());//大写
        System.out.println("World".toLowerCase());//小写
        String x = "20100110";
        System.out.println("输出年月日" + x.substring(0, 4) + "年"
                + x.substring(4, 6) + "月" + x.substring(6, 8) + "日");

    }
}
