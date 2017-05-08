package java1702.javase.basic.reflect.demo.a;

import java1702.javase.basic.reflect.b.*;
import java1702.javase.basic.reflect.b.PortableHdWriter;

/**
 * Created by heishuai.china.cn
 * 2017/5/5 9:12
 * JAVASE
 */
public class Service {
    private FloppyWriter floppyWriter;

    public void write(){
        floppyWriter.writeTofloppy();
    }


    public void setDeviceWriter(PortableHdWriter portableHdWriter) {
    }
}
