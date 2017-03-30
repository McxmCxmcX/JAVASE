package JAVASE.OOp;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author liuxe
 * @since JDK 1.7.0_79
 */
public class CalendarTest {
    static public void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,0,8);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println();
    }
}
//patience  耐心
//courage 勇气
//confidence 信心
//discipline 自律
//compassion 同情心
//功夫熊猫///*/*/*/**/*/*/*/