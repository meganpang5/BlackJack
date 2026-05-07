public class Player {
        String name;
        Card[] hand;
        int cardCount;

        public Player(String pname) {
            name = pname;
            hand = new Card[11];
            cardCount = 0;
        }

        public void addCard(Card card) {
            hand[cardCount] = card;
            cardCount++;
        }

        public void printHand() {
            System.out.println(name + "'s Hand:");
            for (int i = 0; i < cardCount; i++) {
                System.out.println(hand[i]);
            }
            System.out.println();
        }
}
