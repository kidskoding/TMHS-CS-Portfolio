import java.util.*;
public class Player {
    private String name;
    private List<Card> hand;
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }
    public String getName() {
        return name;
    }
    public List<Card> getHand() {
        return hand;
    }
    public int getBlackjackHandValue() {
        int handValue = 0;
        int numAces = 0;
        for(int i = 0; i < hand.size(); i++) {
            int s = Integer.parseInt(hand.get(i).getValue());
            if(s == 1) {
                numAces++;
                handValue += 11;
            }
            else if(s > 10) {
                handValue += 10;
            }
            else {
                handValue += s;
            }
        }
        while(handValue > 21 && numAces > 0) {
            handValue -= 10;
            numAces -= 1;
        }
        return handValue;
    }
    @Override
    public String toString() {
        return name + "'s hand: " + hand + ". " + "Hand Value: " + getBlackjackHandValue();
    }
}