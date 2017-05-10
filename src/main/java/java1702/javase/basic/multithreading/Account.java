package java1702.javase.basic.multithreading;

/**
 * Created by heishuai.china.cn
 * 2017/5/10 14:22
 * JAVASE
 */
public class Account {
    private int money;

    public void withdraw(){

    }
    public int getMoney(){
        return money;
    }
}

class AccountTest implements Runnable{
    @Override
    public void run() {

    }
}