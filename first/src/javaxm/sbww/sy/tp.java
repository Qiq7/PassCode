package javaxm.sbww.sy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;

public class tp {

     public static BufferedImage getImg(String path)
    {
        try { BufferedImage img = ImageIO.read(tp.class.getResource(path));
                return img;
            }catch(IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
