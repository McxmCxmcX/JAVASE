package java1702.javase.basic.newoop;

import com.sun.jmx.snmp.agent.SnmpMibOid;

/**
 * Created by heishuai.china.cn
 * 2017/4/6 11:11
 * JAVASE
 */
public class Car extends Vehicle{

    public Car(String name, double speed, String color) {
        super(name, speed, color);
    }

    @Override
    public void run() {
        System.out.println("car: " + getName() + "is running...");
    }

    @Override
    public void stop() {
        System.out.println("car: " + getName() + " stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car("Tom' car", 20d, "black");
        car.run();
        car.stop();
    }
}
