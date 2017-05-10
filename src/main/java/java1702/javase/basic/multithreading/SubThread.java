package java1702.javase.basic.multithreading;

/**
 * Created by heishuai.china.cn
 * 2017/5/8 16:42
 * JAVASE
 */
public class SubThread extends Thread{

public static void main(String[] args) {
    SubThread subThread = new SubThread();
//        subThread.run(); // ERROR!
    subThread.start();
    System.out.println("test...");
}

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}