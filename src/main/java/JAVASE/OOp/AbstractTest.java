package JAVASE.OOp;

/**
 * Created by heishuai.china.cn
 * 2017/3/21 8:56
 * JAVASE
 */
public abstract class AbstractTest {//抽象类
    // abstract adj.\ 抽象的；深奥的
    private int i; // modifier 修饰符\

    public  abstract void method1();
    public  abstract void method2();
    public  abstract String method3(int i,double d, boolean b);

    public void method4() {

    }

    public static void main(String[] args) {
        //    AbstractTest abstractTest = new AbstractTest(); // instantiated 实例化
        SubAbstractTest subAbstractTest = new SubAbstractTest ();
        System.out.println(subAbstractTest);// java1702.javase.oop.SubAbstractTest@...
    }
}

class SubAbstractTest extends AbstractTest {
    //implement 实现
    @Override
    public void method1() {
        System.out.println("in SubAbstractTest...");

    }

    @Override
    public void method2() {

    }

    @Override
    public String method3(int i, double d, boolean b) {
        return "test";
    }

    @Override
    public void method4() {
        super.method4();
    }
    //implement 实现


}
//抽象方法必须在抽象类里面;
