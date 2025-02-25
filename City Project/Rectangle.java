    import java.awt.*;
    import java.util.*;
    
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
/**
 * Write a description of class Sky here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends JComponent implements Runnable
{
   // instance variables - replace the example below with your own
    private int x,y,w,h;
    private Color color;
    /**
     * Constructor for objects of class Floor
     */
    public Rectangle(int center, int bottom, int width, int height, Color shade)
    {
        this.x = center;
        this.y = bottom;
        this.w = width;
        this.h = height;
        this.color = shade;
    }
    
   
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void setX(int running)
    {
        // update the objects in the cityscape so they are animated
        // ...
        //height = 100 +generator.nextInt(45);
        
        if (running % 2 == 0)
            x +=20;
        else
            x -= 20;
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
    
       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          page.setColor(this.color);
          page.fillRect(x, y, w, h);

          
          //change the y value to move the row down
          //Color sqColor = new Color(0, 0, 255);
          //page.setColor(sqColor);
          //page.fillRect(x+10, y + 10, 100, 10);
       }
       
        public void run()
        {
            int running  = 0;
        while(true){
            
            if(running % 2 == 0)
                x +=20;
            else
                x -= 20;
            running ++;
                try{
                Thread.sleep(17);
            }catch (Exception e){}
            
            System.out.print(x+"-----------------");
            //repaint();
        }
      
    }
}