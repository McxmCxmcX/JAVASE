package java1702.javase.basic.exam;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

/**
 * Created by heishuai.china.cn
 * 2017/4/22 9:11
 * JAVASE
 */
public class JAVA4{
public static void main(String[] args) throws Exception {

		/*
		 * 编写一个程序实现以下功能：()考虑内存优化
	①产生5000个1～9999之间的随机整数，将其存入文本文件a.txt中。
	②从文件中读取这5000个整数，并计算其最大值、最小值和平均值并输出结果。
		 */

        Random r = new Random();
        File file = new File("G:/a/b/c/a.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < 5000; i++) {
        bw.write((r.nextInt(9999)+1)+"");
        bw.newLine();
        bw.flush();
        fw.flush();

        }
        bw.close();
        fw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s="";
        int index=0;
        int a[] = new int [5000];
        while((s=br.readLine())!=null)
        {
        System.out.println(s);
        a[index] = Integer.valueOf(s);
        index++;
        }

        System.out.println("最大值："+GetMax(a));
        br.close();
        fr.close();






        }
private static int GetMax(int[] a)
        {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
        if(a[i]>max)
        {
        max =a[i];
        }
        }
        return max;
        }

        }