package exam;

/**
 * Created by heishuai.china.cn
 * 2017/4/8 13:36
 * JAVASE
 */
//将一个数组中值为0的项去掉,将不为0的值存入一个新的数组,比如:
//　　int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
  //      　　生成的新数组为:
    //    　　int b[]={1,3,4,5,6,6,5,4,7,6,7,5}
public class K2 {
    public static void main(String arg[]){
        int o[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int n[]=new int[o.length];
        int k=0;                                   //用于计算n[]下标的变量
        for(int i=0;i<o.length;i++){
            if(o[i]!=0){                           //判断原数组是否为0,不为0把原数据赋值给新数组
                n[k]=o[i];
                System.out.print(n[k]+"\t");
                k++;
            }
        }
    }

}
