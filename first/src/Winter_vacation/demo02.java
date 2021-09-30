package Winter_vacation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("shur");
        String s1=s.next();
        System.out.println(new File("first\\src\\usb.propers").exists());
        Properties p=new Properties();
        FileInputStream fi=new FileInputStream("first\\src\\usb.propers");
        p.load(fi);
        //System.out.print("shur");
        //Usb u= (Usb) new Factory(p.getProperty(s1)).u;
        Usb u=Factory.creat(p.getProperty(s1));
        if(u==null)
        {
            System.out.println("cwu");
        }else {
            u.service();
        }
    }
}
