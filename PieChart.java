import java.awt.*;
import javax.swing.*;

public class PieChart extends JFrame {
	public PieChart() {
		setLayout(new BorderLayout());
		add(new DrawPieChart(), BorderLayout.CENTER);
	}
}

class DrawPieChart extends JPanel {
	@Override 
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2; //�����I
		int yCenter = getHeight() / 2; //�����I
		int radius = (int)(Math.min(getWidth(),getHeight()) * 0.4); //�]�w�b�|

		int x = xCenter - radius; //���W���}�lx�I
		int y = yCenter - radius; //���W���}�ly�I
		
		//Draw Project
		g.setColor(Color.RED);
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 72); //20%�����72��
		g.setColor(Color.BLACK);
		g.drawString("Projects -- 20%", xCenter + 90, yCenter - radius / 2);
		
		//Draw Quizzes
		g.setColor(Color.BLUE);
		g.fillArc(x, y, 2 * radius, 2 * radius, 72, 36); //�q72�׶}�l���F36��
		g.setColor(Color.BLACK);
		g.drawString("Quizzes -- 10%", xCenter, y);
		
		//Draw Midterms
		g.setColor(Color.GREEN);
		g.fillArc(x, y, 2 * radius, 2 * radius, 108, 108);
		g.setColor(Color.BLACK);
		g.drawString("Midterms -- 30%", 50, yCenter - 40);
		
		//Draw Final
		g.setColor(Color.ORANGE);
		g.fillArc(x, y, 2 * radius, 2 * radius, 216, 144);
		g.setColor(Color.BLACK);
		g.drawString("Final -- 40%", xCenter + 20, yCenter + 110);
	}
}
