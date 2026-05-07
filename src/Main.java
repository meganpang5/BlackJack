public class Main {
    public static void main(String[] args) {

        // Create and shuffle deck
        Deck deck = new Deck();
        deck.shuffle();

        // Create player
        Player player = new Player("Player");

        // Deal player 2 cards
        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());

        // Create dealer
        Player dealer = new Player("Dealer");

        // Deal dealer 1 card
        dealer.addCard(deck.dealCard());

        // Print hands
        player.printHand();
        dealer.printHand();
    }
}
