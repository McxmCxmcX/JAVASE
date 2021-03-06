package java1702.javase.basic.newcollection;

/**
 * Created by heishuai.china.cn
 * 2017/4/8 8:48
 * JAVASE
 */
public class StringBufferDemo {
    public static void main(String[] args) {
                StringBuffer stringBuffer = new StringBuffer("hello");
                stringBuffer.append(" world");
                System.out.println(stringBuffer);
                System.out.println(stringBuffer.delete(5, 6));// Ctrl + Q / Ctrl + J
                System.out.println(stringBuffer.insert(5, ", ")); // offset 偏移量
                System.out.println(stringBuffer.insert(stringBuffer.length(), '!')); // offset 偏移量
                System.out.println(stringBuffer.reverse()); // 逆序
                stringBuffer.reverse().setCharAt(0, 'H');
                System.out.println(stringBuffer);
            }
 }