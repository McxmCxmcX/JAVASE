package java1702.javase.basic.reflect.c;

import java1702.javase.basic.reflect.b.*;
import java1702.javase.basic.reflect.b.PortableHdWriter;
import java1702.javase.basic.reflect.demo.a.Service;

/**
 * Created by heishuai.china.cn
 * 2017/5/5 11:02
 * JAVASE
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        //  service.setDeviceWriter(new ProtableHdWriter());
        service.setDeviceWriter(new PortableHdWriter());
        service.write();
    }
}
