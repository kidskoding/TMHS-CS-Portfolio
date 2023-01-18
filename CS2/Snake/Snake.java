package Snake;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;
public class Snake {
    public static void main(String[] args) {
        new Snake();
    }
    public Snake() {
        JFrame frame = new JFrame("Snake Game");
        JPanel panel = new MyPanel();
        frame.add(panel);
        frame.pack(); frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setAlwaysOnTop(false);
    }
    public class MyPanel extends JPanel implements ActionListener {
        private Random rand;
        private int width, height, scale;
        private String direction;
        private Deque<Cell> snake;
        private Cell apple;
        private KeyHandler keyhandler;
        private Timer timer;
        private Integer score;
        public MyPanel() {
            rand = new Random();
            width = 1000;
            height = 800;
            scale = 25;
            direction = "Right";
            snake = new LinkedList<Cell>();
            snake.add(new Cell(height/2,width/2));
            int appleRow = rand.nextInt(height/scale)*scale;
            int appleCol = rand.nextInt(width/scale)*scale;
            apple = new Cell(appleRow, appleCol);
            keyhandler = new KeyHandler();
            addKeyListener(keyhandler);
            setFocusable(true);
            setBackground(new Color(0,0,0));
            setPreferredSize(new Dimension(width,height));
            timer = new Timer(100, this);
            score = 0;
            timer.start();
        }
        public void actionPerformed(ActionEvent e) {
            direction = keyhandler.getDirection();
            Cell snakeHead = snake.getFirst();
            Cell newSpot;
            switch(direction) {
            	case "Up":
            		newSpot = new Cell(snakeHead.getRow() - scale, snakeHead.getCol());
            		snake.addFirst(newSpot);
            		break;
            	case "Down":
            		newSpot = new Cell(snakeHead.getRow() + scale, snakeHead.getCol());
            		snake.addFirst(newSpot);
            		break;
            	case "Left":
            		newSpot = new Cell(snakeHead.getRow(), snakeHead.getCol() - scale);
            		snake.addFirst(newSpot);
            		break;
            	case "Right":
            		newSpot = new Cell(snakeHead.getRow(), snakeHead.getCol() + scale);
            		snake.addFirst(newSpot);
            		break;
            }
            snakeHead = snake.getFirst();
            if(apple.getRow() == snakeHead.getRow() && apple.getCol() == snakeHead.getCol()) {
            	int appleRow = rand.nextInt(height / scale) * scale;
            	int appleCol = rand.nextInt(width / scale) * scale;
            	apple = new Cell(appleRow, appleCol);
            	score++;
            }
            else {
            	snake.removeLast();
            }
            if(isAtEdge(snake, width, height) || isTouching(snake)) {
            	timer.stop();
            	return;
            }
            repaint();
        }
        public boolean isAtEdge(Deque<Cell> snake, int width, int height) {
        	Cell snakeHead = snake.getFirst();
        	if(snakeHead.getRow() < 0 || snakeHead.getCol() < 0 
        			|| snakeHead.getRow() >= height || snakeHead.getCol() >= width) {
        		return true;
        	}
        	return false;
        }
        public boolean isTouching(Deque<Cell> snake) {
        	Cell snakeHead = snake.getFirst();
        	snake.removeFirst();
        	Iterator<Cell> it = snake.iterator();
        	while(it.hasNext()) {
        		Cell c = it.next();
        		if(snakeHead.getRow() == c.getRow() 
        				&& snakeHead.getCol() == c.getCol()) {
        			return true;
        		}
        	}
        	snake.addFirst(snakeHead);
        	return false;
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(new Color(0,0,0));
            g.fillRect(0, 0, width, height);
            g.setColor(new Color(0,0,0));
            for(int r=0; r<height; r+=scale) {
                for(int c=0; c<width; c+=scale) {
                    g.fillRect(c, r, scale-2, scale-2);
                }
            }
            g.setColor(new Color(0,200,0));
            Iterator<Cell> iterator = snake.iterator();
            while(iterator.hasNext()) {
                Cell cell = iterator.next();
                g.fillRect(cell.getCol(), cell.getRow(), scale-2, scale-2);
            }
            g.setColor(new Color(255,0,0));
            g.fillRect(apple.getCol(), apple.getRow(), scale-2, scale-2);
            g.setFont(new Font("Consolas", Font.BOLD, 22));
            g.setColor(new Color(255, 255, 255));
            g.drawString("Score: " + score, 100, 50);
        }
    }
}