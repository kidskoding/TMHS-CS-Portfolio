package Blackjack;
public class Card {
    private Rank value;
    private Suit suit;

    public Card(Rank value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card(int val, String s) {
        switch(val) {
            case 1 -> { value = Rank.ACE; }
            case 2 -> { value = Rank.TWO; }
            case 3 -> { value = Rank.THREE; }
            case 4 -> { value = Rank.FOUR; }
            case 5 -> { value = Rank.FIVE; }
            case 6 -> { value = Rank.SIX; }
            case 7 -> { value = Rank.SEVEN; }
            case 8 -> { value = Rank.EIGHT; }
            case 9 -> { value = Rank.NINE; }
            case 10 -> { value = Rank.TEN; }
            case 11 -> { value = Rank.JACK; }
            case 12 -> { value = Rank.QUEEN; }
            case 13 -> { value = Rank.KING; }
        }
    }
    public Rank getValue() {
        return value;
    }
    public Suit getSuit() {
        return suit;
    }
    
    @Override
    public String toString() {
        return value + " " + suit;
    }
}