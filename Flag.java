import java.awt.*;
import java.applet.*;

public class Flag {

    public static void drawPole(Graphics g)
    {
        //grey
        g.setColor(new Color(100,100,100));
        //Pole
        g.fillRect(365,100,20,400);
    }

    public static void drawStripes(Graphics g)
    {
        //Red stripes
        g.setColor(new Color(250,0,0));
        g.fillRect(385,100,330,14);
        g.fillRect(385,130,330,14);
        g.fillRect(385,160,330,14);
        g.fillRect(385,190,330,14);
        g.fillRect(385,220,330,14);
        g.fillRect(385,250,330,14);
        g.fillRect(385,280,330,14);
        //White stripes
        g.setColor(new Color(255,255,255));
        g.fillRect(385,115,330,14);
        g.fillRect(385,145,330,14);
        g.fillRect(385,175,330,14);
        g.fillRect(385,205,330,14);
        g.fillRect(385,235,330,14);
        g.fillRect(385,265,330,14);
    }
    public static void drawStars(Graphics g)
    {
        //Blue Square
        g.setColor(new Color(0,0,250));
        g.fillRect(385,100,140,105);
        // Circles before stars
        g.setColor(new Color(255,255,255));
        //Row 1
        g.fillOval(395,105,12,12);
        g.fillOval(415,105,12,12);
        g.fillOval(435,105,12,12);
        g.fillOval(455,105,12,12);
        g.fillOval(475,105,12,12);
        g.fillOval(505,105,12,12);




    }





















}
