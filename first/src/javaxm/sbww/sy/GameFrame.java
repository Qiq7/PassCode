package javaxm.sbww.sy;
import javax.swing.JFrame;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame()
    {
        setTitle("飞机大战");
        setSize(512,768);
        setLocationRelativeTo(null);  //居中
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        GamePanel panel = new GamePanel();
        panel.act();
        frame.add(panel);
        frame.setVisible(true);
    }

}
