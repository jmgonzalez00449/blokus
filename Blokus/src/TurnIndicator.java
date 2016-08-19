import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

import javax.swing.JPanel;


public class TurnIndicator extends JPanel implements Serializable {
	
	Color myCurrentTurn;
	
	public TurnIndicator( Color currentTurn ) {
		
		myCurrentTurn = currentTurn;
	}
	
	public void setCurrentTurn( Color currentTurn ) {
		
		myCurrentTurn = currentTurn;
	}
	
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(java.awt.Color.BLACK);
		g2.fill(new Rectangle2D.Double(0, 0, this.getWidth(), this.getHeight()));
		
		Font font = new Font("Serif", Font.PLAIN, this.getHeight()/5);
		g2.setFont(font);
		g2.setColor(Player.colorToJavaColor(myCurrentTurn));
		g2.drawString("It is", 0, (int)(this.getHeight()/4.5));
		g2.drawString(Player.colorToString(myCurrentTurn) + "'s", 0, 2*(int)(this.getHeight()/4.5) );
		g2.drawString("turn.", 0, 3*(int)(this.getHeight()/4.5));
		
		
	}
}
