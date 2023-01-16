    
      
    import java.awt.*;
    import java.util.*;
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
     
/**
 * Write a description of class house here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House
{
    // instance variables - replace the example below with your own
    private int baseX, baseY;
    private Color shed, outline, roof, roofShadow, windowFrame, door;
    
    /**
     * Constructor for objects of class house
     */
    public House(int x, int y, Color shed, Color outline, Color roof, Color roofShadow, Color windowFrame, Color door)
    {
          this.baseX = x;
          this.baseY = y;
          
          this.shed = shed;
          this.outline = outline;
          this.roof = roof;
          this.roofShadow = roofShadow; 
          this.windowFrame = windowFrame;
          this.door = door;
    }
    
       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          page.setColor(this.roofShadow);
          page.fillOval(baseX+6, baseY-65, 190, 130);//roof shadow
          
          page.setColor(this.roof);
          page.drawOval (baseX+6, baseY-65, 190, 130);//roof
           
          page.setColor(this.shed);
          page.fillRect(baseX, baseY, 200, 170);
          
          page.setColor(this.outline);
          for (int m = 0, j = 0; m <8; m++, j+=22)
          {   
              page.drawLine(baseX, baseY+j, baseX + 200, baseY+j);
          }
          
          page.setColor(this.windowFrame);
          page.fillRect(baseX+65, baseY+20, 60, 60);
          
          page.setColor(this.door);
          page.fillOval (baseX+70, baseY+100, 50, 50);//door
          page.fillRect(baseX+70, baseY+122, 50, 40);
          
          
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