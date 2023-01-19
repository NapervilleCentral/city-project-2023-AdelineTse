    import java.awt.*;
    import java.util.*;
    import java.awt.image.*;
    import java.io.*;
    import javax.swing.*;
    import javax.swing.JComponent;
    import java.awt.image.BufferedImage;
    import javax.imageio.ImageIO;
/**
 * Write a description of class SunAndMoon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lights extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private Color windowOn, windowOff;
    private DayAndNight dayNight;
    
    private BufferedImage offlamp, onlamp1, onlamp2;
    /**
     * Constructor for objects of class SunAndMoon
     */
    public Lights(DayAndNight dayNight)
    {   
        this.dayNight = dayNight;
        try {
            offlamp = ImageIO.read(new File("offlamp.PNG"));
        }
        catch (IOException e) {}
        try {
            onlamp1 = ImageIO.read(new File("onlamp1.PNG"));
        }
        catch (IOException e) {}
        try {
            onlamp2 = ImageIO.read(new File("onlamp2.PNG"));
        }
        catch (IOException e) {}
    }
    public void nextFrame()
    {
        repaint();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw(Graphics2D page)
    {
        //daytime
        if (y >= 400)
        {
            page.drawImage(offlamp, 500, 430, null);
        }
        
        //nighttime
        if (y < 400)
        {
             page.drawImage(onlamp1, 500, 430, null);
            //flickering lights
            if (y % 4 == 0)
            {
                page.drawImage(onlamp2, 500, 430, null);
            }
        }
        //page.fillOval((int) (Math.sin(theta)), (int)(theta), 50, 50);
        
    }
     
    
    public void run()
    {
        //makes lights flicker
        int flicker = 0; 
        int running  = 0;
        while(true){
            flicker ++;
                try{
                Thread.sleep(200);
            }catch (Exception e){}
            
            System.out.print("!!!!!");
            
        }
  
    }
}