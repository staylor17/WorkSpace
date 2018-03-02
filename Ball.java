import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class Ball extends JComponent
{
	private int dx = 0;
	private int dy = 0;
	
	public Ball(int x, int y)
	{
		setLocation(x,y);
		setSize(20,40);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g3 = (Graphics2D) g;
		g3.setColor(Color.PINK);
		
		Ellipse2D.Double ball = new Ellipse2D.Double(0,0,7,7);
		g3.fill(ball);
	
	}
	
	
	public void setDX(int x)
	{
		dx = x;
	}
	
	public void setDY(int y)
	{
		dy = y;
	}
	
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
			
	
}
