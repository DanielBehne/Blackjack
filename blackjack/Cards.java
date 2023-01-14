import java.util.Random;

public class Cards {
    private int value;
    private String suit;
    private String[] Suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private String[] Tens = {"10", "Jack", "Queen", "King"};
    public void getCard() {
        int value = (int) (Math.random() * 10) + 1;
        if (value == 1) {
            System.out.println("Ace");
        } else {
            System.out.println(value);
        }
        if (value == 10) {
            
        }
    }
}