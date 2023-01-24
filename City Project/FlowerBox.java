import java.awt.*;
import java.util.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.swing.JComponent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
/**
 * Write a description of class house here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlowerBox
{
    // instance variables - replace the example below with your own
    private int baseX, baseY;
    private Color box, outline, dirt;
    private BufferedImage flowers;

    /**
     * Constructor for objects of class house
     */
    public FlowerBox(int x, int y, Color box, Color outline, Color dirt)
    {
        this.baseX = x;
        this.baseY = y;

        this.box = box;
        this.outline = outline;
        this.dirt = dirt;
        //import flowers
        try {
            flowers = ImageIO.read(new File("flowersInBox.png"));
        }
        catch (IOException e) {}
    }

    //-----------------------------------------------------------------
    //  Draws this figure relative to baseX, baseY, and height.
    //-----------------------------------------------------------------
    public void draw (Graphics2D page)
    {
        //make dirt
        page.setColor(this.dirt);
        page.fillOval(baseX+6, baseY-20, 90, 60);//dirt
        
        //make garden box
        page.setColor(this.box);
        page.fillRect(baseX, baseY, 100, 60);//box
        
        //lines on the gardenbox
        page.setColor(this.outline);
        for (int m = 0, j = 0; m <3; m++, j+=30)
        {   
            page.drawLine(baseX, baseY+j, baseX +100, baseY+j);
        }

        page.drawImage(flowers, baseX-5, baseY-110, null);
    }

    public void run()
    {
        int running  = 0;
        while(true){

            if(running % 2 == 0)
                baseX +=20;
            else
                baseX -= 20;
            running ++;
            try{
                Thread.sleep(17);
            }catch (Exception e){}

            System.out.print(baseX+"-----------------");
            //repaint();
        }

    }
}