import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Adeline
 * @version 18 July 2014
 */
public class Cityscape extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private final int HEIGHT_MIN = 100;
    private final int VARIANCE = 45;
    
    private Rectangle bluesky, grass;
    // define the Cityscape contructor and intiailize all instance variables
    // ...
    
    public Cityscape()
    {
        bluesky = new Rectangle(30,30, 600, 500, new Color(116,157,161));
        grass = new Rectangle(30, 400, 600, 200, new Color(180,190,137));
        //chickfence = new Fence(30, 400, new Color(243, 226, 186));
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    
    public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
        bluesky.draw(page);
        grass.draw(page);
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
    
    public void run()
    {
    }
}
