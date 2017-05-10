package java1702.javase.basic.multithreading;

/**
 * Created by heishuai.china.cn
 * 2017/5/9 23:52
 * JAVASE
 */
public class PriorityTest implements Runnable{
    public static void main(String[] args) {
        //priorityTest// 优先级/比较高.可能得到更多的时间片/优先级低的则少
        Thread thread1 = new Thread((Runnable) new PriorityTest(), "thread 1");
        Thread thread2 = new Thread((Runnable) new PriorityTest(), "thread 2");
        Thread thread3 = new Thread((Runnable) new PriorityTest(), "thread 3");

        thread1.setPriority(1);
        thread2.setPriority(1);
        thread3.setPriority(10);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread currThread = Thread.currentThread();
            System.out.println(currThread.getName() + ":" + currThread.getPriority());
        }
    }
}
