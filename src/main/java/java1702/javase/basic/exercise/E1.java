package java1702.javase.basic.exercise;

import java.util.HashMap;

/**
 * Created by heishuai.china.cn
 * 2017/4/12 16:06
 * JAVASE
 */
/*
         使用地图接口的实现类完成员工工资（姓名→工资）的摸拟：
         添加几条信息
         列出所有的员工姓名
         列出所有员工姓名及其工资
         删除名叫汤姆的员工信息
         输出杰克的工资，并将其工资改为1500元
         将所有工资低于1000元的员工的工资上涨20％
         * /*/
public class E1 {
    public static void main(String[] args) {
        // TODO Auto-generated method Stub
        HashMap<String, Integer> Employee = new HashMap<String, Integer>();
        //添加几条信息
        Employee.put("Tom",2000);
        Employee.put("Jack",3000);
        Employee.put("Amy",500);
        Employee.put("Joe",800);
        //列出所有员工姓名
        System.out.println("列出所有员工姓名: ");
        for (String s1 : Employee.keySet()) {
            System.out.println(s1);
            //列出所有员工

        }
    }
}
