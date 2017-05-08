package java1702.javase.basic.reflect.b;

import java1702.javase.basic.reflect.demo.a.Service;

/**
 * Created by heishuai.china.cn
 * 2017/5/5 10:58
 * JAVASE
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        service.setDeviceWriter(new PortableHdWriter());
        service.write();
    }
}
