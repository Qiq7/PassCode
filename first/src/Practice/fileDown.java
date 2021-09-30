package Practice;

import java.io.*;
import java.net.URL;


public class fileDown {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JetBrains\\项目\\first\\src\\tp\\bg10.jpg");
        File file1 = new File("D:\\JetBrains\\项目\\first\\src\\Practice\\bg.jpg");
        System.out.println(file.getAbsolutePath());
        FileInputStream fs = new FileInputStream(file);
        FileOutputStream fo = new FileOutputStream(file1);
        int i = 0;
        while ((i=fs.read())!=-1)
        {
            fo.write(i);
        }
        System.out.println(file.exists());
        System.out.println(file.getName());
    }

}
