package JAVASE.OOp;

/**
 * Created by 石磊 on 2017/3/14.
 */
// 所有的水仙花数 153= 1^3 + 5^3 + 3^3 = 1 + 125 +27
    // 四位  abcd = a^4 + ...
public class eee3 {
    public static void main(String[] args) {
        for (int i = 100; i <1000; i++){
            // 123 ==1*1*1 + 2*2*2 +3*3*3
            int bai = i / 100;//百位数字
            int shi = i /10 % 10;//十位数字
            int ge = i % 10;//个位数字
            if (i == bai * bai * bai + shi * shi * shi + ge * ge * ge) {
                System.out.println(i);

            }
        }
    }
}



