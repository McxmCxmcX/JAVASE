package java1702.javase.basic.multithreading;

/**
 * Created by heishuai.china.cn
 * 2017/5/8 9:53
 * JAVASE
 */
public class Test implements Runnable{
    public static void main(String[] args) {
        //进程过程
        //线程线程线程

        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
