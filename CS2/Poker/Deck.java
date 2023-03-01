import java.util.Stack;
import java.util.Random;
import java.util.Iterator;
public class Deck {
    private Stack<Card> deck;
    public Deck() {
        deck = new Stack<Card>();
        for(int value=1; value<=13; value++) {
            deck.push(new Card(value, "?"));
            deck.push(new Card(value, "?"));
            deck.push(new Card(value, "?"));
            deck.push(new Card(value, "?"));
        }
    }
    public Stack<Card> getDeck() {return deck;}
    public void riffleShuffle() {
        Stack<Card> L = new Stack<Card>();
        Stack<Card> R = new Stack<Card>();
        int numCards = deck.size();
        for(int i=0; i<numCards/2; i++) {
            L.push(deck.pop());
        }
        while(deck.size() > 0) {
            R.push(deck.pop());
        }
        Random rand = new Random();
        while(L.size() > 0 || R.size() > 0) {
            int x = rand.nextInt(3)+1; // 1,2,3
            for(int i=0; i<x; i++) {
                if(L.size()>0) {
                    deck.push(L.pop());
                }
            }
            int y = rand.nextInt(3)+1; // 1,2,3
            for(int i=0; i<y; i++) {
                if(R.size()>0) {
                    deck.push(R.pop());
                }
            }
        }
    }
    public void printDeck() {
        Iterator<Card> itr = deck.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}