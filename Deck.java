import java.util.Random;

public class Deck {
    private Card[] cards;

    // Getters
    public Card getCardAt(int i) {
        return cards[i];
    }

    // Setters
    public void setCardAt(int i, String suit, int rank) {
        cards[i].setSuit(suit);
        cards[i].setRank(rank);
    }

    // Other Methods
    public void shuffleDeck() {
        Random r = new Random();

        for (int i = cards.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);

            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }
}
