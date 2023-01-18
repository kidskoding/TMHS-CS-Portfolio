public class Card {
    private Rank value;
    private Suit suit;

    public Card(Rank value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card(int value, String suit) {
        switch(value) {
            case 1 -> { }
            case 2 -> { }
            case 3 -> { }
            case 4 -> { }
            case 5 -> { }
            case 6 -> { }
            case 7 -> { }
            case 8 -> { }
            case 9 -> { }
            case 10 -> { }
            case 11 -> { }
            case 12 -> { }
            case 13 -> { }
        }
    }
    public String getValue() {
        return value;
    }
    public String getSuit() {
        return suit;
    }
    @Override
    public String toString() {
        return value + " " + suit;
    }
}