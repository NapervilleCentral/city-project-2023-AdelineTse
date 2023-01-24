

    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class Fence extends JComponent implements Runnable
    {
       private int baseX;     // center of figure
       private int baseY;     // floor (bottom of feet)
       private Color color1, color2, color3, color4;   // color of stick figure
       private int height;    // height of stick figure
       Random generator = new Random();

       //-----------------------------------------------------------------
       //  Sets up the stick figure's primary attributes.
       //-----------------------------------------------------------------
       public Fence (int x, int y, Color back, Color backOutline, Color shadow, Color fenceOutline)
       {
          baseX = x;
          baseY = y;
          color1 = back;
          color2 = backOutline;
          color3 = fenceOutline;
          color4 = shadow;

       }


       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          page.setColor(this.color4);//back of fence outline
          page.drawRect(baseX, baseY+20, 602, 22);
           
             // back of fence
          page.setColor(this.color3);
          page.fillRect(baseX, baseY+20, 600, 20);
          
          //while loop that generates fences until it reaches the point
          for (int m = 0, j = 0; m <12; m++, j+=50)
          {   
              page.setColor(this.color2);//fence outline
              page.drawRect(baseX+j, baseY, 22, 102);
              
              page.setColor(this.color1);//fence color
              page.fillRect(baseX+j, baseY, 20, 100);
              
          }
       }

       
             public void run()
        {
                int running  = 0;
            while(true){
                
                if(running % 2 == 0)
                    baseX +=20;
                else
                    baseX -= 20;
                running ++;
                    try{
                    Thread.sleep(17);
                }catch (Exception e){}
                
                System.out.print(baseX+"-----------------");
                //repaint();
            }
      
        }
    }
