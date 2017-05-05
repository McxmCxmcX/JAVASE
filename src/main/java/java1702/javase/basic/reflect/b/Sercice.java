package java1702.javase.basic.reflect.b;

/**
 * Created by heishuai.china.cn
 * 2017/5/5 9:41
 * JAVASE
 */
public class Sercice {
    private DeviceWriter deviceWriter;

    //public Service(DeviceWriter deviceWriter){
    //   This.deviceWriter = deviceWriter;
//}

    public void setDeviceWriter(DeviceWriter deviceWriter){
        this.deviceWriter = deviceWriter;
    }
    public void write(){
        deviceWriter.writeToDevice();
    }
}
