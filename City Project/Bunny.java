    import java.awt.*;
    import java.util.*;
    import java.awt.image.*;
    import java.io.*;
    import javax.swing.*;
    import javax.swing.JComponent;
    import java.awt.image.BufferedImage;
    import javax.imageio.ImageIO;
   
/**
 * Write a description of class Bunny here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bunny extends JComponent implements Runnable
{
    private BufferedImage bunny;
    private int running = 0;
    private double x=-290, y=0, height= 0;
    
    private String fileName;
    /**
     * Constructor for objects of class Bunny
     */
    public Bunny(String fileName)
    {
     
        try {
            bunny = ImageIO.read(new File(fileName));
        }
        catch (IOException e) {}
    
    }
    public Bunny(String fileName, double x)
    {
     
        try {
            bunny = ImageIO.read(new File(fileName));
        }
        catch (IOException e) {}
        this.x = x;
    }
    
    public void nextFrame()
    {  
        repaint();
    }
    
    public void draw (Graphics2D page)
    {   
        page.drawImage(bunny, (int)x, (int)y, null);
        
    }
    
    public void run()
    {
            int running  = 0;
            while(true){
                
                x += 3;
                if (x > 700) 
                    x = 0;
                y= 25*Math.sin(x%180 / 3.14159 )+450; 
                
                try{
                    Thread.sleep(50);
                }catch (Exception e){
                    e.printStackTrace();
                }
                
                System.out.println("x:" + x + " y" + y);
                
            }
      
        }
}
