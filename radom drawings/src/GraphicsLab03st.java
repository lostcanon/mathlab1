// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random(1234);
		
		
		// Draw Random Lines
		for (int k= 1; k <= 100; k++){
			int Red = rnd.nextInt(255) + 1;
			int Blue = rnd.nextInt(255) + 1;
			int Green = rnd.nextInt(255 + 1);
			Color customColor = new Color(Red, Blue, Green);
			g.setColor(customColor);
			int x1 = rnd.nextInt(350);
			int y1 = rnd.nextInt(300);
			int x2 = rnd.nextInt(350);
			int y2 = rnd.nextInt(300);
			g.drawLine(x1, y1, x2, y2);
		}

				
		
		// Draw Random Squares
		for (int line = 1; line <= 1000; line++) {
			int x = rnd.nextInt(355) + 400;
			int y = rnd.nextInt(225) + 15;
			int red = rnd.nextInt(225) + 1;
			int green = rnd.nextInt(225) + 1;
			int blue = rnd.nextInt(225) + 1;
			g.setColor (new Color( red , green , blue ));
			g.fillRect(x, y, 50, 50);}
		



		
		// Draw Random Circles
	 for (int b = 1; b <= 100; b++){
	int Red = rnd.nextInt(255) + 1;
	int Blue = rnd.nextInt(255) + 1;
	int Green = rnd.nextInt(255) + 1;
	Color customColor = new Color( Red , Blue , Green);
	g.setColor(customColor);
	int circleDiameter = rnd.nextInt(210);
	int x1 = (390-circleDiameter) +10;
	int y2 = (390-circleDiameter) + 200;
	g.drawOval(x1, y2, circleDiameter, circleDiameter );
	 }
	





		
		// Draw 3-D Box
	
	
	
	
	
	
	}
}



    
 