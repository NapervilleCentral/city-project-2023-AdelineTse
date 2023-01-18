import javax.swing.JFrame;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Write a description of class SunAndMoon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SunAndMoon extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private double theta;
    private Color sun, sunOutline, moon;
    private double x, y;
    
    /**
     * Constructor for objects of class SunAndMoon
     */
    public SunAndMoon(Color sun, Color sunOutline, Color moon)
    {
        this.sun = sun;
        this.moon = moon;
        this.sunOutline = sunOutline;
        //bluesky = new Rectangle(30,30, 600, 500, new Color(186, 223, 232));
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
        // put your code here
        page.setColor(this.sun);
        x = (250* Math.sin(theta))+300;
        y = (250 * Math.cos(theta)) + 300;
        page.fillOval((int)x, (int)y, 50, 50);
        
        if (y > 100)
        {
            page.setColor(this.sun);
            
        }
        if (y < 100)
        {
            page.setColor(this.moon);
        }
        //page.fillOval((int) (Math.sin(theta)), (int)(theta), 50, 50);
    }
     
    
    public void run()
    {
            int running  = 0;
        while(true){
            theta++;
                try{
                Thread.sleep(17);
            }catch (Exception e){}
            
            System.out.print("????????????????????????");
            
        }
  
    }
}