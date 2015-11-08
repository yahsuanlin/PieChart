import java.awt.*;
import javax.swing.*;

public class TestPieChart {
	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new PieChart();
		frame.setSize(400, 300);
		frame.setTitle("Draw Pie Chart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setVisible(true);		
	}
}