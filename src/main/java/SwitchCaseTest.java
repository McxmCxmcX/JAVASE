import java.util.Scanner;

/**
 * Created by 石磊 on 2017/3/10.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D:");
        String s = scanner.nextLine();
        System.out.println(s);

        int i = 2;

        switch (i){
            case 0:
                System.out.println("i = 0...");
                break;
            case 1 :
                System.out.println("i = 1...");
                break;
            default:
                System.out.println("default");
                break;

        }
    }
}
