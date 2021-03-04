import java.awt.* ;
import java.awt.event.* ;
public class House  extends Frame   
{
  public House()   
  {
    setBackground(Color.yellow);
    setTitle("First House");
    setSize(450,350);
    setVisible(true);

    addWindowListener(new WindowAdapter()   
	{  
	public void windowClosing( WindowEvent e )
	{
 	  System.exit(0);
     } } ) ;
  }
  public void paint( Graphics g )   {
		                     // to draw outer house 
    g.drawLine(50,300,375,300);           //  Flooring of the house
    g.drawLine(80,300,80,150);            //  Left wall of outer house
    g.drawLine(200,300,200,150);          //  Right wall of outer house		
    g.drawLine(50,170,140,110);           //  Left inclination of the roof		
    g.drawLine(140,110,230,170);          //  Right inclination of the roof	
  	                            // to draw entrance(door frame)
    g.drawLine(110,220,110,300);	       //  Entrance left	
    g.drawLine(170,220,170,300); 	       //  Entrance right
    g.drawLine(110,220,170,220); 	       //  Entrance top
	                            // to draw the man
    g.drawLine(320,280,300,300); 	       //  Left leg
    g.drawLine(320,280,340,300); 	       //  Right leg
    g.drawLine(320,280,320,250); 	       //  Body
    g.drawLine(300,270,320,250); 	       //  Left hand
    g.drawLine(340,270,320,250); 	       //  Right hand
    g.drawOval(310,230,20,20);             //  Head
  }
  public static void main(String args[])  {
    new House();   				
  }
}