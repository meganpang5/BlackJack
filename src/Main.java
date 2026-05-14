import java.util.Scanner;

public class Main {
    boolean gameOver;
    public static void main(String[] args) {
        Main newGame = new Main();
    }

    public Main(){
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
        System.out.println("press (h) to hit, press (s) to stand");
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.equals("h")){
                player.addCard(deck.dealCard());
                player.getSumCard();
                player.printHand();
                if(player.sumCard > 21) {
                    System.out.println("You Busted!");
                    gameOver = true;
                }
            }
            if(input.equals("s")){
                player.printHand();
                if(dealer.sumCard>16){
                    dealer.printHand();
                }
                if(dealer.sumCard<=16){
                    dealer.addCard(deck.dealCard());
                    dealer.getSumCard();
                    dealer.printHand();
                }
                if(dealer.sumCard>player.sumCard){
                    System.out.println("Dealer Wins!");
                }
                if(dealer.sumCard<player.sumCard){
                    System.out.println("You Win!");
                }
            }
        }
    }

}
