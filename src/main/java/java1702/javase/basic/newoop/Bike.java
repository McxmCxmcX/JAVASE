package java1702.javase.basic.newoop;

/**
 * Created by heishuai.china.cn
 * 2017/4/6 11:07
 * JAVASE
 */
public class Bike extends Vehicle {

    public Bike(String name, double speed, String color) {
        super(name, speed, color);
    }

    public void run() {
        System.out.println("bike: " + getName() + " is running...");
    }

    public void stop() {
        System.out.println("bike: " + getName() + " stopped.");
    }

    public static void main(String[] args) {
        Vehicle bike = new Bike("Jerry's bike", 10d, "white");
        bike.run();
        bike.stop();
        bike.info();
    }
}
