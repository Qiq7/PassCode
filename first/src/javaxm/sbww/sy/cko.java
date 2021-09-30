package javaxm.sbww.sy;
import javax.swing.*;
import  java.util.Random;

public class cko {
    public static void creatFrame(Random  r)
    {
        JFrame  jf = new JFrame("hhh~~~");
        jf.setSize(400,100);
        jf.setLocation(r.nextInt(500),r.nextInt(500));
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 5 ; i++) {
            creatFrame(r);
        }
    }

}
