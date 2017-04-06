package java1702.javase.basic.newoop;

/**
 * Created by heishuai.china.cn
 * 2017/4/6 11:21
 * JAVASE
 */
public class Mankind {
    // static 静态 ； dynamic 动态\
    String name;
    static String earth; //地球

}

class NewTest {
    public static void main(String[] args) {
        Mankind tom = new Mankind();
        tom.name = "Tom";
        Mankind.earth = "Tom 种了一棵树";
        System.out.println(tom.name);
        System.out.println(Mankind.earth);

        Mankind jerry = new Mankind();
        jerry.name = "jerry";
        System.out.println(jerry.name);
        System.out.println(Mankind.earth);
    }
}
