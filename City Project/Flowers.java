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
 *  Flowers

 */
public class Flowers extends JComponent //implements Runnable
{
    private BufferedImage flowers, carrots;
    private int x, y, randomGraphX, randomGraphY;
    private int running = 0;
    
    Random rand = new Random();
    /**
     * Constructor for objects of class Flowers
     */
    public Flowers()
    {
        x = 100;
        y = 100;
        try {
            flowers = ImageIO.read(new File("flowers.PNG"));
        }
        catch (IOException e) {}
        try {
            carrots = ImageIO.read(new File("carrots.PNG"));
        }
        catch (IOException e) {}
    }

    public void draw (Graphics2D page)
    {
        
        page.drawImage(carrots, 30, 408, null);
        page.drawImage(carrots, 90, 420, null);
        page.drawImage(carrots, 150, 408, null);
        page.drawImage(carrots, 210, 420, null);
        
        
        page.drawImage(flowers, 490, 540, null);
        
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
                repaint();
            }
      
        }
}
