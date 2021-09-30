package javaxm2.sbww.sy2;

import javax.swing.*;
import java.awt.*;
import java.math.*;

public class gq extends JPanel{


    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Font n = new Font("宋体",Font.BOLD,15);
        g.setColor(Color.RED);
        g.fillRect(0,0,400,200);
        g.setColor(Color.YELLOW);
        g.setFont( new Font("宋体",Font.BOLD,40));
        g.drawString("★" ,30,60);
        g.setFont(n);
        g2.rotate(Math.tan(0.5),80,20);
        g.drawString("★" ,80,20);
        g2.rotate(-Math.tan(0.5),80,20);
        g2.rotate(Math.tan(1),100,30);
        g.drawString("★" ,100,30);
        g2.rotate(-Math.tan(1),100,30);

        g.drawString("★" ,100,65);

        g2.rotate(Math.tan(0.5),80,80);
        g.drawString("★" ,80,80);
        g2.rotate(-Math.tan(0.5),80,80);

        g.setColor(Color.white);
        g.fillRect(0,200,400,200);
        g.setColor(Color.red);
        g.fillOval(175,275,50,50);
        g.setColor(Color.white);
        g.fillRect(400,200,400,260);
        //g.setColor(Color.BLUE);
        //g.fillRect(400,200,200,91);
        g.setColor(Color.white);
        //g.setFont( new Font("宋体",Font.BOLD,15));
        for (int i = 0; i < 13 ; i++) {
            if(i%2==0)  g.setColor(Color.RED);
            else g.setColor(Color.white);
            g.fillRect(400,200+i*20,400,20);

        }
        g.setColor(Color.BLUE);
        g.fillRect(400,200,200,140);
        g.setColor(Color.white);
        for (int i = 1; i <= 9; i++) {

                if(i%2==1)g.drawString("  ★ ★ ★ ★ ★ ★ ★ " ,400+2*5,(200+(i+1)*12));


        }


    }
    public static void main(String[] args) {
        JFrame pp = new JFrame();
        gq q = new gq();
        pp.setSize(1000,800);
        pp.setTitle("国旗");
        pp.setLocationRelativeTo(null);
        pp.setVisible(true);
        pp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setBackground(Color.white);
        pp.add(q);



    }
}
