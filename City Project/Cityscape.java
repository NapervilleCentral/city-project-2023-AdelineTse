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
    private Fence bunnyfence;
    private House bunnyHouse;
    private Flowers carrotsAndFlowers;
    // define the Cityscape contructor and intiailize all instance variables
    // ...
    
    public Cityscape()
    {
        bluesky = new Rectangle(30,30, 600, 500, new Color(186, 223, 232));
        grass = new Rectangle(30, 400, 600, 300, new Color(173, 227, 102));
        bunnyfence = new Fence(30, 330, new Color(255, 249, 227), new Color (255, 219, 128), new Color(255, 192, 173), new Color(255, 226, 214));
        bunnyHouse = new House(280, 310, new Color(233, 242, 247), new Color(204, 226, 240), new Color(101, 147, 173), new Color(133, 172, 201), new Color(178, 196, 141), new Color(66, 59, 43));
        carrotsAndFlowers = new Flowers();    
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
        
        page.setStroke(new BasicStroke(8));
        bunnyfence.draw(page);
        
        page.setStroke(new BasicStroke(4));
        bunnyHouse.draw(page);
        
        carrotsAndFlowers.draw(page);
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
