package exam;

import java.util.Scanner;

/**
 * Created by heishuai.china.cn
 * 2017/4/1 13:46
 * JAVASE
 */
// 从键盘上输入一个字符串，利用字符串类的方法将大写字母转变为小写字母，小写字母转变为大写字母，再将前后字符对换,然后输出最后结果。
public class exam2 {
//    public static void main(String args[])  {
//    InputStreamReader isr= new InputStreamReader(System.in);
//    BufferedReader br = new BufferedReader(isr);
//    StringBuffer strb = null;
//        try {
//        strb = new StringBuffer(br.readLine());
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//    int i;
//        for(i=0; i<strb.length(); i++){
//        char ch = strb.charAt(i);
//        if(ch<='Z' && ch>='A')
//            strb.setCharAt(i,(char)(ch+32));
//        if(ch<='z' && ch>='a')
//            strb.setCharAt(i,(char)(ch-32));
//    }
//        strb.reverse();
//        System.out.println(strb);
//}


    public static void main(String[] args) {

       char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'j', 'h', 'i', 'g', 'k',};
       String s2 = new String(chars);

        System.out.println(s2);

        String str = new String(chars);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

    }

    private static String toLowerCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {
                chars[i] += 32; // a - A = 32
            }
        }
        return new String(chars);
    }

}
