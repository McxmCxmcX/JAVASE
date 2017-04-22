package java1702.javase.basic.collection;

import java.util.Arrays;

/**
 * Created by heishuai.china.cn
 * 2017/3/31 9:58
 * JAVASE
 */
public class StringCopyTest {
    public static void main(String[] args) {
        int[] srcArray = {1,2,3,4,5,6};
        int[] destArray = new int[10];

        //src - source 源 \
        //dest - destination 目的地\
        System.out.println(Arrays.toString(destArray));
        System.arraycopy(srcArray, 1, destArray, 6, 4);
        System.out.println(Arrays.toString(destArray));

        String[] strings = {"a", "b", "c","d",null,null,null,null,null,null};
    }
}
