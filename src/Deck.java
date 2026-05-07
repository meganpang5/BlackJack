public class Deck {

    Card[] cards;
    int currentCard;

    public Deck() {

        cards = new Card[52];
        currentCard = 0;

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int[] values = {
                2,3,4,5,6,7,8,9,10,
                10,10,10,11
        };

        int index = 0;

        for (int s = 0; s < suits.length; s++) {
            for (int r = 0; r < ranks.length; r++) {

                cards[index] = new Card(ranks[r], suits[s], values[r]);
                index++;
            }
        }
    }

    public void shuffle() {

        for (int i = 0; i < cards.length; i++) {

            int randomIndex = (int)(Math.random() * cards.length);

            Card temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
    }

    public Card dealCard() {

        Card dealt = cards[currentCard];
        currentCard++;

        return dealt;
    }
}