package java1702.javase.basic.newoop;

import com.sun.jmx.snmp.agent.SnmpMibOid;
import org.omg.IOP.ComponentIdHelper;

/**
 * Created by heishuai.china.cn
 * 2017/4/7 8:57
 * JAVASE
 */
public class ParameterPassTest {
    private String s;
    private static void test(ParameterPassTest x) {


        System.out.println("b: " + x.s);
        x.s = "hello";
        System.out.println("c: " + x.s);
    }

    public static void main(String[] args) {
        ParameterPassTest parameterPassTest = new ParameterPassTest();
//        System.out.println("a: " + ParameterPassTest.);
        test(parameterPassTest);//实参
        System.out.println("d: " + parameterPassTest.s);//？
    }
}
