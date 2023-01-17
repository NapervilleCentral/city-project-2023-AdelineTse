    import java.awt.*;
    import java.util.*;
    import java.awt.image.*;
    import java.io.*;
    import javax.swing.*;
    import javax.swing.JComponent;
    import java.awt.image.BufferedImage;
    import javax.imageio.ImageIO;
    import java.util.Random;
/**
 * Write a description of class Bunny here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bunny
{
    private BufferedImage fluffy, ophelia;
    private int running = 0;
    private int x, y, randomGraphX, randomGraphY;
    Random rand = new Random();
    /**
     * Constructor for objects of class Bunny
     */
    public Bunny()
    {
     
       
        
        try {
            fluffy = ImageIO.read(new File("fluffy.png"));
        }
        catch (IOException e) {}
        try {
            ophelia = ImageIO.read(new File("ophelia.PNG"));
        }
        catch (IOException e) {}
    
    }
    public void draw (Graphics2D page)
    {
        
        page.drawImage(fluffy, 30, 408, null);
        page.drawImage(ophelia, 90, 420, null);
       
        
    }
    
    public void run()
        {
                int running  = 0;
            while(true){
                
                if(running % 2 == 0)
                    x +=20;
                else
                    y -= 20;
                running ++;
                    try{
                    Thread.sleep(17);
                }catch (Exception e){}
                
                System.out.print(x+"-----------------");
                //repaint();
            }
      
        }
}
