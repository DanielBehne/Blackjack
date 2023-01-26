import java.util.Random;
import java.util.ArrayList;
public class singleCPU extends CPU {
    public int value;
    private ArrayList<Integer> previousCards = new ArrayList<Integer>();
    static int total;
    static public int dealerTotal = ((total/2)+CPUTotal/2);

    private String[] suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private String[] tens = {"10", "Jack", "Queen", "King"};
    public void getCard() {
        for(int i=1; i<=1; i++) {
            int value = (int) (Math.random() * 10) + 1;
            if (value == 1) {
                Random random1 = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (value));
            } else if (value == 10) {
                Random random3 = new Random();
                System.out.println(tens[random3.nextInt(tens.length)] + (" of ") + suit[random3.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (value));
            } else {
                Random random2 = new Random();
                System.out.println((value) + (" of ") + suit[random2.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (value));
            } 
            if (!previousCards.contains(value)) {
                previousCards.add(value);
            }
            previousCards.add(value);
        }

        for(int v = 0; v<previousCards.size(); v++) {
            total += previousCards.get(v);
        }
        int dealerTotal = ((total/2)+CPUTotal/2);
        System.out.println("The total value of the CPU's hand is " + dealerTotal);
        System.out.println(" ");
    }
}
