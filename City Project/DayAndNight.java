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
public class DayAndNight extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private double theta;
    private Color sun, sunOutline, moon;
    private double x=-40, y= 80;
    private Rectangle bluesky, darksky;
    private boolean day = false;
    /**
     * Constructor for objects of class SunAndMoon
     */
    public DayAndNight(Color sun, Color sunOutline, Color moon)
    {
        this.sun = sun;
        this.moon = moon;
        this.sunOutline = sunOutline;
        bluesky = new Rectangle(30,30, 600, 500, new Color(186, 223, 232));
        darksky = new Rectangle(30,30, 600, 500, new Color(72, 86, 125));
        
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
    public double draw(Graphics2D page)
    {
        // put your code here
        x = (400* Math.sin(theta))+300;
        y = (300 * Math.cos(theta)) + 400;
        
        //daytime
        if (y >= 400)
        {
            bluesky.draw(page);
            page.setColor(this.sun);
            page.fillOval((int)x, (int)y -500, 50, 50);
            day = true;
        }
        
        //nighttime
        if (y < 400)
        {
 
            darksky.draw(page);
            page.setColor(this.moon);
            page.fillOval((int)x, (int)y, 50, 50);
            day = false;
        }
        //page.fillOval((int) (Math.sin(theta)), (int)(theta), 50, 50);
        
        return y;
    }
    
    public boolean getDay()
    {   
        return day;
    }
    
    
    public void run()
    {
            int running  = 0;
        while(true){
            theta+=Math.PI/100;
                try{
                Thread.sleep(200);
            }catch (Exception e){}
            
            System.out.print("????????????????????????");
            
        }
  
    }
}