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

    /**
     * Constructor for objects of class SunAndMoon
     */
    public SunAndMoon()
    {
        
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
        page.fillOval((int) (250 * Math.sin(theta)) + 3700, (int)(200 * Math.cos(theta)) + 210, 50, 50);
    }
     
    
    public void run()
    {
            int running  = 0;
        while(true){
            theta++;
                try{
                Thread.sleep(17);
            }catch (Exception e){}
            
            System.out.print("-----------------");
            
        }
  
    }
}