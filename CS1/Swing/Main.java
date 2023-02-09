package CS1.Swing;
import javax.swing.*;
import java.awt.*;
public class Main {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private static JButton button;
    private static ImageIcon icon = new ImageIcon("TMHS-CS-Portfolio/CS1/Swing/javaimg.png");
    public Main() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        button = new JButton("Click on Me!");
        setup();
    }
    public static void main(String[] args) {
        Main a = new Main();
        Main b = new Main();
    }
    public JPanel getPanel() {
        return panel;
    }

    private void setup() {
        //Add label to panel
        panel.add(label);

        //Add button to label
        panel.add(button);

        //Create panel
        panel.setPreferredSize(new Dimension(500, 500)); //sets preferred size of a panel
        panel.setBackground(new Color(255, 0, 0)); //creates a panel, a component of a frame

        Font font = new Font("Arial", Font.PLAIN, 50);
        label.setFont(font);
        label.setText("Hello");

        //Add panel to frame
        frame.add(panel); //adds panel to frame
        frame.pack(); //sets size of frame
        frame.setTitle("Fun with Swing!"); //sets title of frame
        frame.setIconImage(Main.icon.getImage()); //sets image of JFrame
        frame.setLocationRelativeTo(null); //sets location of window (JFrame)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets operation of JFrame, close? hide?
        frame.setResizable(true);
        frame.setVisible(true);
    }
}