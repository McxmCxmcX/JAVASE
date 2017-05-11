package java1702.javase.basic.multithreading;

import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;
        import org.jsoup.nodes.Element;
        import org.jsoup.select.Elements;

        import java.io.IOException;

/**
 * Created by heishuai.china.cn
 * 2017/5/8 9:53
 * JAVASE
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://bj.lianjia.com/ershoufang/dongcheng/pg4/").cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
        Elements elements = document.select("li[class=clear]");
        for (Element element : elements) {
            String imageUrl = element.childNode(0).attr("href");
            System.out.println(imageUrl.substring(imageUrl.lastIndexOf("/") + 1, imageUrl.lastIndexOf(".")));
        }
    }
}
//进程过程
//线程线程线程
//
//        Test test = new Test();
//        Thread thread = new Thread(test);
//        thread.start();
//
//        System.out.println("test...");
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
