package java1702.javase.basic.oop;

import java.util.Arrays;

/**
 * Created by heishuai.china.cn
 * 2017/3/30 10:33
 * JAVASE
 */
public class E33 {
    public static void main(String[] args) {
                int[] l1 = {1};
                int[] l2 = {1, 1};
                int[] l3 = {1, 2, 1};
                int[] l4 = {1, 3, 3, 1};
        //        int[] l5 = {1, 4, 6, 4, 1};
                 int[] l5 = new int[5];
                int[] array1 = {1};
                int[] array2 = {1, 1};
                int[] array3 = {1, 2, 1};
                int[] array4 = {1, 3, 3, 1};
        //        int[] array5 = {1, 4, 6, 4, 1};

                        int[] array5 = new int[5];
                for (int i = 0; i < array5.length; i++) {
                       if (i == 0 || i == array5.length - 1) {
                                array5[i] = 1;
                            } else {
                                array5[i] = array4[i - 1] + array4[i];
                            }
                    }
                System.out.println(Arrays.toString(array5));
    }
}

