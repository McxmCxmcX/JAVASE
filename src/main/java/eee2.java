/**
 * Created by 石磊 on 2017/3/14.
 */
public class eee2 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++){
            boolean b = true; //b: j 能否整除 i ->i 是否是素数
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    b = false;
                }
            }
            if (b){
                System.out.println(i);
            }
        }
    }
}
