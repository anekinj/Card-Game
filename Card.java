public class Card {
    private String suit;
    private int rank;

    // Getters
    public String getSuit() {
        return suit;
    }
    public int getRank() {
        return rank;
    }
    public String getRankAsLiteral() {
        String cardFace = "";

        switch (rank) {
            case 11:
                cardFace = "Jack";
                break;
            case 12:
                cardFace = "Queen";
                break;
            case 13:
                cardFace = "King";
                break;
            case 14:
                cardFace = "Ace";
                break;
            default:
                cardFace = Integer.toString(rank);
        }

        return cardFace;
    }

    // Setters
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
}
