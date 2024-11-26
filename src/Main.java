import be.ehb.card.Card;
import be.ehb.card.Suit;
import be.ehb.card.Value;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        Card mCard = new Card(Suit.SPADES, Value.ACE);
        System.out.println(mCard);

        Card[] cards = new Card[52];
        int cardNR = 0;

        for(Value v : Value.values()){
            for(Suit s : Suit.values()){
                Card currentCard = new Card(s, v);
                cards[cardNR] = currentCard;
                cardNR++;
            }
        }

        System.out.println(Arrays.toString(cards));

    }
}