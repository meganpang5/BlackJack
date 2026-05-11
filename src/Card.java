public class Card {
    String rank;
    String suit;
    int value;
    boolean isFlipped;

    public Card(String prank, String psuit, int pvalue) {
        rank = prank;
        suit = psuit;
        value = pvalue;
        isFlipped = false;
    }
    public void flipCard() {
        isFlipped = !isFlipped;
    }


    public String toString() {
        return rank + " of " + suit;
    }
    public void printCard() {
        if (isFlipped) {
            System.out.println("[Hidden Card]");
        } else {
            System.out.println(value + " of " + suit);
        }
    }
}
