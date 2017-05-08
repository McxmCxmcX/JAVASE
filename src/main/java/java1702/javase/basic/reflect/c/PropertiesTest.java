package java1702.javase.basic.reflect.c;
import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.Properties;
/**
 * Created by heishuai.china.cn
 * 2017/5/5 11:02
 * JAVASE
 */
public class PropertiesTest {

            // properties 属性\ ['prɒpətɪz]

            public static void main(String[] args) throws IOException {
                Properties properties = new Properties();
                properties.load(new FileReader("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
                System.out.println(properties.getProperty("key"));
                System.out.println(properties.getProperty("k"));
            }
 }