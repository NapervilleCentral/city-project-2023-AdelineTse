    import java.awt.*;
    import java.util.*;
    import java.awt.image.*;
    import java.io.*;
    import javax.swing.*;
    import javax.swing.JComponent;
    import java.awt.image.BufferedImage;
    import javax.imageio.ImageIO;
    
/**
 *  Flowers

 */
public class Flowers extends JComponent //implements Runnable
{
    private BufferedImage flowers, flowers2, carrots;
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
            flowers = ImageIO.read(new File("flowers.png"));
        }
        catch (IOException e) {}
        try {
            carrots = ImageIO.read(new File("carrots.PNG"));
        }
        catch (IOException e) {}
        try {
            flowers2 = ImageIO.read(new File("flowers2.png"));
        }
        catch (IOException e) {}
    }

    public void draw (Graphics2D page)
    {
        
        page.drawImage(carrots, 30, 408, null);
        page.drawImage(carrots, 90, 420, null);
        page.drawImage(carrots, 150, 408, null);
        page.drawImage(carrots, 210, 420, null);
        
        
        page.drawImage(flowers, 500, 540, null);
        page.drawImage(flowers, 36, 530, null);
        page.drawImage(flowers, 90, 580, null);
        
        page.drawImage(flowers2, 500, 430, null);
        page.drawImage(flowers2, 350, 540, null);
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
