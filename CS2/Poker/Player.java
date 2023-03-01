import java.util.List;
import java.util.ArrayList;
public class Player {
    private String name;
    private List<Card> hand;
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }
    public String getName() {return name;}
    public List<Card> getHand() {return hand;}
    public void sortHand() {
        for(int i = 0; i < hand.size(); i++) {
            for(int j = 0; j < hand.size() - 1; j++) {
                int v1 = hand.get(j).getValue();
                int v2 = hand.get(j + 1).getValue();
                if(v1 == 1) v1 = 14;
                if(v2 == 1) v2 = 14;
                if(v2 < v1) {
                    Card temp = hand.get(j);
                    hand.set(j, hand.get(j + 1));
                    hand.set(j + 1, temp);
                }
            }
        }
    }
    public int blackJackHandValue() {
        int handValue = 0;
        for(int i=0; i<hand.size(); i++) {
            int cardValue = hand.get(i).getValue();
            if(cardValue == 1) {handValue += 11;}
            else if(cardValue > 10) {handValue += 10;}
            else {handValue += cardValue;}
        }
        for(int i=0; i<hand.size(); i++) {
            int cardValue = hand.get(i).getValue();
            if(handValue > 21 && cardValue == 1) {
                handValue -= 10;
            }
        }
        return handValue;
    }
}