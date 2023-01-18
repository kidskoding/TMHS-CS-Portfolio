package Snake;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyHandler implements KeyListener {
    private String direction;
    public KeyHandler() {direction = "Right";}
    public String getDirection() { return direction; }
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP && !direction.equals("Down"))   {direction="Up";}
        if(e.getKeyCode()==KeyEvent.VK_DOWN && !direction.equals("Up"))   {direction="Down";}
        if(e.getKeyCode()==KeyEvent.VK_LEFT && !direction.equals("Right")){direction="Left";}
        if(e.getKeyCode()==KeyEvent.VK_RIGHT && !direction.equals("Left")){direction="Right";}
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}