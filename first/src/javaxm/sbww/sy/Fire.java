package javaxm.sbww.sy;

public class Fire extends Fly{
    public Fire(int hx,int hy)
    {
        img = tp.getImg("/tp/bg11.png");
        w = img.getWidth()/2;
        h = img.getHeight()/2;
        x = hx+35;y=hy;
    }
    public void move()
    {
        y-=10;
    }

}
