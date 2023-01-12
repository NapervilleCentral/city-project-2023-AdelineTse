
/**
 * Write a description of class Poly1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class Poly1 extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private Color myColor;
    private int[] xPos = {95, 105, 110, 90};
    private int[] yPos = {45, 45, 70,70};
    private Poly1 aShape;
    /**
     * Constructor for objects of class Poly1
     */
    public Poly1(Color userColor)
    {
        // initialise instance variables
        this.myColor = userColor;
        
    }
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method 
        // ...
        draw(g2);
        
        
    }
    public void draw(Graphics2D page)
    {
        page.setColor(myColor);
        page.fillPolygon(xPos, yPos, xPos.length);
    }
    
    public void run()
    {
        int running = 0;
        while (true)
        {
            if (running % 2 == 0)
        
                myColor = new Color (175, 175, 175);
            else
                myColor = Color.yellow;
                
            running ++; 
            try{
                Thread.sleep(17);//30 fps
            }
            catch (Exception e){};
        }
    }
}
    

