package UnitCircleGame;
import javax.swing.*;
public class Game extends JFrame {
    public static void main(String[] args) {
        new Game();
    }
    public Game() {
        ImageIcon gameIcon = new ImageIcon("TMHS-CS-Portfolio/CS2/UnitCircleGame/unitcircle.png");
        setIconImage(gameIcon.getImage());
        createFrame();
    }
    private void createFrame() {
        setVisible(true);
        setSize(1920, 1080);
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}