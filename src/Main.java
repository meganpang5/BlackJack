import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Player player = new Player("Player");
        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        Player dealer = new Player("Dealer");
        dealer.addCard(deck.dealCard());
        Card hidden = deck.dealCard();
        hidden.isFlipped = false;
        dealer.addCard(hidden);
        player.getSumCard();
        dealer.getSumCard();
        player.printHand();
        dealer.printHand();


    }
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
}
