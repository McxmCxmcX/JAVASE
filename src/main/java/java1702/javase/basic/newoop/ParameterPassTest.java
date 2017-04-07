package java1702.javase.basic.newoop;

import com.sun.jmx.snmp.agent.SnmpMibOid;
import org.omg.IOP.ComponentIdHelper;

/**
 * Created by heishuai.china.cn
 * 2017/4/7 8:57
 * JAVASE
 */
public class ParameterPassTest {
    private static void test(String X) {
        System.out.println("b: " + X);
        X = "hello";
        System.out.println("c: " + X);
    }

    public static void main(String[] args) {
        String s = "hi";
        System.out.println("a: " + s);
        test(s);
        System.out.println("d: " + s);
    }
}
