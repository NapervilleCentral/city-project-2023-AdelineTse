import javax.swing.JFrame;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
 
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 5000;
   
    /**
     * main method for the program which creates and configures the frame for the program
     * 
     * @param args  not used
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        //size
        frame.setSize(700 /* x */, 800 /* y */);
        //name
        frame.setTitle("Bunny farm");
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        //Cityscape thisCity = new Cityscape();
        
        //when to set visiblw
        Cityscape row = new Cityscape();
        //frame.add(component);
        frame.add(row);
        row.run();
        
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            row.nextFrame();
            //it sleeps in milliseconds
            Thread.sleep( 17 );//may have to adjust to look good?
        }
        
    }

}