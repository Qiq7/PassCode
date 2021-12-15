package Study;


import java.io.IOException;
import java.util.Properties;




public class test01 {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        ClassLoader loader = test01.class.getClassLoader();

        properties.load(loader.getResourceAsStream("Study/p.properties"));
        System.out.println(properties.get("a"));
    }
}
