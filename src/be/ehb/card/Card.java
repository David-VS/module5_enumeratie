package be.ehb.card;

public class Card {
    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value.name() + " of " + this.suit.name();
    }
}
