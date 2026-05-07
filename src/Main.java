public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Player player = new Player("Player");
        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        Player dealer = new Player("Dealer");
        dealer.addCard(deck.dealCard());
        player.printHand();
        dealer.printHand();
    }
}
