package javaxm.sbww.sy;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Ep extends Fly{

    public Ep()
    {
        Random r =new Random();
        int r2 = r.nextInt(2)+3;
        img = tp.getImg("/tp/bg"+r2+".png");
        w = img.getWidth();
        h = img.getHeight();
        x=r.nextInt(500-w);y=50;
    }
    public void move()
    {
        y+=10;
    }
    public boolean shootBy(Fire f)
    {
        boolean h2 = x<=f.x+f.w && x>=f.x-f.w && y<=f.y+f.h&&y>=f.y-h;
        return  h2;

    }
}
