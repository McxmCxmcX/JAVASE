package JAVASE.OOp;

/**
 * Created by heishuai.china.cn
 * 2017/3/24 8:46
 * JAVASE
 */
public class ScopeTst {
    //  scope范围
    public void method() {
        i = 0;

        int j = 1; //local variable 局部变量
        System.out.println(j);

        for (int k = 0; k < 10; k++) {
            j = 2;
            System.out.println(j);
        }
        for (int k = 0; k < 10; k++) {
        }
        }
        private int i;

    public static void main(String[] args) {
        ScopeTst scopeTst = new ScopeTst();
        scopeTst.method();
    }
    public void exceptionTest() {
        try {
            String s = "hello";
        } catch (Exception e) {

        }finally {
            String s = "hi";
        }
      }
    }
