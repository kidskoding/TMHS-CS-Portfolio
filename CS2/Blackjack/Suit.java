public enum Suit {
    DIAMONDS ("♦"),
    HEARTS ("♥"),
    SPADES ("♠"),
    CLUBS ("♣");
    
    private final String symbol;
    private Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}