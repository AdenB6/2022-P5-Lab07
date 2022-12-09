import java.awt.*;
import java.applet.*;

public class Background {
    public static void drawSky(Graphics g)
    {
        //Blue
        g.setColor(new Color(150,200,255));
        //Rectangle Top
        g.fillRect(0,0,1000,325);
    }
    public static void drawWhiteRect(Graphics g)
    {
        //White
        g.setColor(new Color(255,255,255));
        // rectangle
        g.fillRect(0,0,1000,30);
        //Clouds
        g.fillOval(815,0,150,50);
        g.fillOval(915,0,150,100);
    }
    public static void drawClouds(Graphics g)
    {
        //White
        g.setColor(new Color(255,255,255));
        //Circles
        g.fillOval(715,0,150,50);
        g.fillOval(615,0,150,50);
        g.fillOval(515,0,150,50);
        g.fillOval(415,0,150,50);
        g.fillOval(315,0,150,50);
        g.fillOval(215,0,150,50);
        g.fillOval(115,0,150,50);
        g.fillOval(15,0,150,50);
        g.fillOval(0,0,150,50);
    }
    public static void drawGround(Graphics g)
    {
        //Dark Green
        g.setColor(new Color(50,200,50));
        //rectangle Bottom
        g.fillRect(0,325,1000,325);
    }
    public static void drawSun(Graphics g)
    {
        //Bright Yellow or just Yellow
        g.setColor(new Color(255,220,0));
        //Sun Circle
        g.fillOval(850,0,150,150);
    }
}
