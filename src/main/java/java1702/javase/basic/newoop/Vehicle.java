package java1702.javase.basic.newoop;
/**
 * Created by heishuai.china.cn
 * 2017/4/6 10:53
 * JAVASE
 */
public abstract class Vehicle {
    private String name;
    private double speed;
    private String color;

    public Vehicle(String name, double speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void run();

    public abstract void stop();

    public void info() {
        System.out.println("color is:" + color + "; speed is " + speed + "km/h");
    }
}

