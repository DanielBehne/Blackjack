import java.util.Random;
import java.util.ArrayList;
public class Player1 {
    public int value;
    private static ArrayList<Integer> previousCards = new ArrayList<Integer>();
    static public int playerTotal;

    private static String[] suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private static String[] tens = {"10", "Jack", "Queen", "King"};
    public static void getCard() {
        for(int i=1; i<=2; i++) {
            int value = (int) (Math.random() * 10) + 1;
            if (value == 1) {
                Random random1 = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else if (value == 10) {
                Random random3 = new Random();
                System.out.println(tens[random3.nextInt(tens.length)] + (" of ") + suit[random3.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else {
                Random random2 = new Random();
                System.out.println((value) + (" of ") + suit[random2.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } 
            if (!previousCards.contains(value)) {
                previousCards.add(value);
            }
            previousCards.add(value);

        }
        for(int v = 0; v<previousCards.size(); v++) {
            playerTotal += previousCards.get(v);
        }
        System.out.println("The total value of your hand is " + (playerTotal/2));
        System.out.println(" ");
    }
}

