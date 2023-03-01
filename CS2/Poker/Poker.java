 
import java.util.Scanner;
public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Poker!");
        System.out.println("What is your name?");
        String name = in.next();
        System.out.println("Hello " + name);
        Player p = new Player(name);
        Player cpu = new Player("CPU");
        Deck d = new Deck();
        for(int i = 0; i < 1000; i++) {
            d.riffleShuffle();
        }
        for(int i = 0; i < 5; i++) {
            p.getHand().add(d.getDeck().pop());
            cpu.getHand().add(d.getDeck().pop());
        }
        System.out.println(p.getName() + " - " + p.getHand());
        System.out.println(cpu.getName() + " - " + cpu.getHand());
        p.sortHand();
        cpu.sortHand();
        System.out.println(p.getName() + " - " + p.getHand());
        System.out.println(cpu.getName() + " - " + cpu.getHand());
    }
}