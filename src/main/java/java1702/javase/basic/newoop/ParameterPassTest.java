package java1702.javase.basic.newoop;

import com.sun.jmx.snmp.agent.SnmpMibOid;
import org.omg.IOP.ComponentIdHelper;

/**
 * Created by heishuai.china.cn
 * 2017/4/7 8:57
 * JAVASE
 */
public class ParameterPassTest {

    private static void test(int x) {//形参
        System.out.println("b: " + x);//0
        x++;
        System.out.println("c: " + x);//1
    }

    public static void main(String[] args) {
        int i = 0;
       System.out.println("a: " + i);//0
        test(i);//实参
        System.out.println("d: " + i);
    }

    }
