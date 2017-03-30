package JAVASE.OOp;

/**
 * Created by heishuai.china.cn
 * 2017/3/27 16:50
 * JAVASE
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strings;
        strings = new String[10];
        strings[0] = "test...";
        System.out.println(strings[0]); //下标 索引 index

        boolean[] booleans = new boolean[10000];
        booleans[0] = true;
        System.out.println(booleans[99]);// ?

        int[] ints = {1, 2, 3, 4, 5, 6, 67777, 888};
        System.out.println(ints[6]);

        double[] doubles = new double[1000];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = i + 1;
        }
        System.out.println("------" + doubles[doubles.length - 1]);
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = i + 1;
            System.out.println(doubles[i]);
        }


        ArrayTest[] arrayTests = {new ArrayTest(), new ArrayTest(), new ArrayTest()};


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May"};

        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            System.out.println(month);
        }
        System.out.println("--------------------");


        for (String month : months) ;{
            System.out.println(months);
        }
        int[] monthDays = {31,28};
    }
}