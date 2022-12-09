import java.awt.*;
import java.applet.*;

public class Lab07 extends Applet {

    public void paint(Graphics g){
        //Background
        Background.drawSky(g);
        Background.drawClouds(g);
        Background.drawWhiteRect(g);
        Background.drawGround(g);
        Background.drawSun(g);
        //Flag
        Flag.drawPole(g);
        Flag.drawStripes(g);
        Flag.drawStars(g);
        //Birds
        //Birds.drawSmallW(g);
        //Birds.drawBigW(g);
    }
}
