public class Card {
    private int value;
    private String suit;
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    public int getValue() {return value;}
    public String getSuit() {return suit;}
    public String getTextValue() {
        if(value==1) {return "Ace";}
        else if(value>=2 && value<=10) {return Integer.toString(value);}
        else if(value==11) {return "Jack";}
        else if(value==12) {return "Queen";}
        else if(value==13) {return "King";}
        else {return "ERROR";}
    }
    public String toString() {
        return getTextValue() + getSuit();
    }
}
