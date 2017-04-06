package exam;

import java.util.ArrayList;
import java.util.Collections;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by heishuai.china.cn
 * 2017/4/1 13:47
 * JAVASE
 */
// 定义一个方法，实现数组的转置输出   例如： 源数组，1 2 3 4 5 6 转置之后的数组，6 5 4 3 2 1
public class exam5 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        System.out.println("反转前：" + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后：" + arrayList);
    }
}