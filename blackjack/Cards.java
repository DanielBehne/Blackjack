import java.util.Random;

public class Cards {
    public int value;
    private String[] suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private String[] tens = {"10", "Jack", "Queen", "King"};
    public void getCard() {
        int value = (int) (Math.random() * 10) + 1;
        if (value == 1) {
            Random random1 = new Random();
            System.out.println(("Ace") + (" of ") + suit[random1.nextInt(suit.length)]);
        } else if (value == 10) {
            Random random3 = new Random();
            System.out.println(tens[random3.nextInt(tens.length)] + (" of ") + suit[random3.nextInt(suit.length)]);
        } else {
            Random random2 = new Random();
            System.out.println((value) + (" of ") + suit[random2.nextInt(suit.length)]);
        }  
    }
}