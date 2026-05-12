public class Player {
        String name;
        Card[] hand;
        int cardCount;
        int sumCard;

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
            System.out.println(name + "'s Hand: "+sumCard);
            for (int i = 0; i < cardCount; i++) {
                hand[i].printCard();
            }

            System.out.println();
        }
        public int getSumCard() {
            int sum = 0;
            for(int x = 0; x<cardCount; x++){
               sum = sum + hand[x].value;
            }
            sumCard = sum;
            return sumCard;
        }

}
