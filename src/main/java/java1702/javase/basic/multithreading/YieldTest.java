package java1702.javase.basic.multithreading;

/**
 * Created by heishuai.china.cn
 * 2017/5/9 23:30
 * JAVASE
 */
public class YieldTest implements Runnable {
    //    public static void main(String[] args) {
//        Thread thread1 = new Thread(new YieldTest(), "thread 1");
//        Thread thread2 = new Thread(new YieldTest(), "thread 2");
//
//        thread1.start();
//        thread2.start();
//        System.out.println("test...");
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i + ": " + Thread.currentThread().getName() + "is running...");
//            if (i % 10 == 0) {
//                Thread.yield();//让步
//            }
//        }
//    }
    public static void main(String[] args) {
//        Thread thread1 = new Thread(new YieldTest(), "thread1 ");
//        Thread thread2 = new Thread(new YieldTest(), "thread2 ");
//
//        thread1.start();
//        thread2.start();
//        System.out.println("test...");
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10000; i++) {
//            System.out.println(i + " :" +Thread.currentThread().getName() + " is running...");
//            if (i % 10 == 0){
//                Thread.yield();
//            }
//        }
        Thread thread1 = new Thread(new YieldTest(), "thread1");
        Thread thread2 = new Thread(new YieldTest(), "thread2");

        thread1.start();
        thread2.start();
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + ":" + Thread.currentThread().getName()+"is running...");
            if (i % 10 ==0){
                Thread.yield();
            }
        }
    }
}
