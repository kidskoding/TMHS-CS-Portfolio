import java.util.*;
public class Deck {
    private Stack<Card> deck;
    public Deck() {
        deck = new Stack<Card>();
        for(int i = 1; i <= 13; i++) {
            String s = "";
            switch(i) {
                case 1:
                    s = "A";
                    break;
                case 11:
                    s = "J";
                    break;
                case 12:
                    s = "Q";
                    break;
                case 13:
                    s = "K";
                    break;
                default:
                    s = Integer.toString(i);
            }
            deck.push(new Card(s, Suit.SPADES));
            deck.push(new Card(s, "♣"));
            deck.push(new Card(s, "♥"));
            deck.push(new Card(s, "♦"));
        }
    }
    public Stack<Card> getDeck() {
        return deck;
    }
    public void shuffle() {
        for(int k = 1; k <= 10; k++) {
            Stack<Card> left = new Stack<Card>();
            Stack<Card> right = new Stack<Card>();
            int cardCount = 0;
            while(deck.size() > 0) {
                if(cardCount <= 13)
                    left.push(deck.pop());
                else
                    right.push(deck.pop());
                cardCount++;
            }
            Random rand = new Random();
            while(left.size() > 0 || right.size() > 0) {
                int leftNum = rand.nextInt(3) + 1;
                for(int i = 0; i < leftNum; i++) {
                    if(left.size() > 0)
                        deck.push(left.pop());
                }
                int rightNum = rand.nextInt(3) + 1;
                for(int i = 0; i < rightNum; i++) {
                    if(right.size() > 0)
                        deck.push(right.pop());
                }
            }
        }
    }
    @Override
    public String toString() {
        String result = "";
        result += "[";
        for(Card card : deck) {
            result += card + ", ";
        }
        result += "]";
        return result;
    }
}