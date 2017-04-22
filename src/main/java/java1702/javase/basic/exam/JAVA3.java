package java1702.javase.basic.exam;
import java.io.*;
/**
 * Created by heishuai.china.cn
 * 2017/4/22 9:10
 * JAVASE
 */
public class JAVA3 {
    public static void main(String[] args)throws IOException
    {
        File file1=new File("c:\\11.txt");
        File file2=new File("c:\\12.txt");
        FileInputStream fis=new FileInputStream(file2);
        InputStreamReader isr=new InputStreamReader(fis);
        FileOutputStream fos=new FileOutputStream(file1,true);
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        int c;
        while((c=isr.read())!=-1)
        {
            osw.write((char)c);
        }
        isr.close();
        osw.close();
    }
}