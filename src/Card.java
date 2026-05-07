public class Card {
    String rank;
    String suit;
    int value;

    public Card(String prank, String psuit, int pvalue) {
        rank = prank;
        suit = psuit;
        value = pvalue;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
