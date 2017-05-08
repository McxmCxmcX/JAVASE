package java1702.javase.basic.exam;

import java1702.javase.basic.newcollection.Test2;

;
/**
 * Created by heishuai.china.cn
 * 2017/5/6 15:10
 * JAVASE
 */
//编写一个实现方法重载的程序
public class f2 {
        public void pt(){
            System.out.println('X');
        }
        public int pt(char c){
            return c;
        }
        public String pt(int i,char c){
            return c + "=" + i;
        }
        public static void main(String[] args){
            Test2 t = new Test2();
            t.pt();
            System.out.println(t.pt('X'));
            System.out.println(t.pt(88,'X'));
        }
    }