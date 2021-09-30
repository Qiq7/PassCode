package javaxm.sbww.sy;

import java.awt.image.BufferedImage;
import java.io.File;

public class Hero extends Fly {

    public Hero()
    {
        img = tp.getImg("/tp/bg6.png");
        x = 200;y = 600;
        w = img.getWidth();h =img.getHeight();
    }
    public void moveTo(int mx,int my)
    {
        x = mx;
        y = my;
    }


}
