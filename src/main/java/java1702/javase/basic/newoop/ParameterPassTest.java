package java1702.javase.basic.newoop;

import com.sun.jmx.snmp.agent.SnmpMibOid;
import org.omg.IOP.ComponentIdHelper;

/**
 * Created by heishuai.china.cn
 * 2017/4/7 8:57
 * JAVASE
 */
public class ParameterPassTest {
    private static void method(boolean x){
        System.out.println("2: " + x);
        x = false;
        System.out.println("3: " + x);


    }

    public static void main(String[] args) {
    boolean x = true;
        System.out.println("1: " + x);
        method(x);
        System.out.println("4: " + x);
    }

}
