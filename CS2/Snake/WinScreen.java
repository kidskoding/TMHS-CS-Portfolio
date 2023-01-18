package Snake;
import javax.swing.*;
import java.awt.*;
public class WinScreen extends JPanel {
	private int score;
	public WinScreen(int score) {
		this.score = score;
		JFrame frame = new JFrame("Win Screen");
        JPanel panel = new WinScreen(score);
        frame.add(panel);
        frame.pack(); frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setAlwaysOnTop(false);
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Consolas", Font.BOLD, 36));
        g.setColor(new Color(255, 255, 255));
        g.drawString("GAME OVER", 500, 500);
        
        g.setFont(new Font("Consolas", Font.BOLD, 18));
        g.setColor(new Color(255, 255, 255));
        g.drawString("Score: " + score, 500, 400);
	}
}