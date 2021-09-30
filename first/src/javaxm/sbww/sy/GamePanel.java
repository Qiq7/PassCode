package javaxm.sbww.sy;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class GamePanel extends JPanel {

    BufferedImage bg;
    Hero hero = new Hero();
    //Ep   p = new Ep();
    List<Ep> Eps = new ArrayList<Ep>();
    List<Fire> fires = new ArrayList<Fire>();
    int score;
    public void  act()
    {
        new Thread()
        {
          public void run()
          {
              while(true)
              {
                  epEnter();
                  epMove();
                  shoot();
                  shootMove();
                  shootEp();
                  try {
                      Thread.sleep(50);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  repaint();

              }
          }
        }.start();
    }
    private void shootEp()
    {
        for (int i = 0; i < fires.size(); i++) {
            Fire f = fires.get(i);
            bang(f);
        }
    }
    private void bang(Fire f){
        for (int i = 0; i < Eps.size(); i++) {
            Ep e = Eps.get(i);
            if(e.shootBy(f))
            {
                Eps.remove(e);
                fires.remove(f);
                score+=10;
            }
        }
    }
    int index2 = 0;
    private void shootMove()
    {
        for (int i = 0; i < fires.size(); i++) {
            Fire f = fires.get(i);
            f.move();
        }
    }
    int index = 0;
    private  void shoot()
    {
        index2++;
           if(index2 == 5) {
               Fire fire = new Fire(hero.x, hero.y);

               fires.add(fire);
               index2=0;
           }
    }

    private void epEnter()
    {
        index++;
        if(index == 20)
        {
            Ep e = new Ep();
            Eps.add(e);
            index = 0;
        }
    }
    private void epMove()
    {
        for (int i = 0; i < Eps.size(); i++) {
            Ep e = Eps.get(i);
            e.move();
        }
    }
    public GamePanel()
    {
        setBackground(Color.RED);
        bg = tp.getImg("/tp/bg10.jpg");
        MouseAdapter ada = new MouseAdapter()
        {
            @Override
            public void mouseMoved(MouseEvent e) {
                //System.out.println("hahah");
                int mx = e.getX()-60;
                int my = e.getY()-55;
                hero.moveTo(mx,my);
                repaint();
            }
        };
        addMouseListener(ada);
        addMouseMotionListener(ada);
    }
    /*
    * 画图
    * */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bg,0,0,null);
        for (int i = 0; i < Eps.size(); i++) {
            Ep e2 = Eps.get(i);
            g.drawImage(e2.img,e2.x,e2.y,e2.w,e2.h,null);

        }
        for (int i = 0; i < fires.size(); i++) {
            Fire fire = fires.get(i);
            g.drawImage(fire.img,fire.x,fire.y,fire.w,fire.h,null);
        }
        g.drawImage(hero.img,hero.x,hero.y,hero.w,hero.h,null);
        g.setColor(Color.white);
        g.drawString("分数"+score,10,30);

    }
}
