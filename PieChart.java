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
		
		int xCenter = getWidth() / 2; //取原點
		int yCenter = getHeight() / 2; //取原點
		int radius = (int)(Math.min(getWidth(),getHeight()) * 0.4); //設定半徑

		int x = xCenter - radius; //左上角開始x點
		int y = yCenter - radius; //左上角開始y點
		
		//Draw Project
		g.setColor(Color.RED);
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 72); //20%佔圓形72度
		g.setColor(Color.BLACK);
		g.drawString("Projects -- 20%", xCenter + 90, yCenter - radius / 2);
		
		//Draw Quizzes
		g.setColor(Color.BLUE);
		g.fillArc(x, y, 2 * radius, 2 * radius, 72, 36); //從72度開始佔了36度
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
