public class Cards {
    private int value;
    private String suit;
    String spades;
    String clubs;
    String hearts;
    String diamonds;
    public void getCard() {
        int value = (int) (Math.random() * 10) + 1;
        if (value == 1) {
            System.out.println("Ace");
        } else {
            System.out.println(value);
        }
    }
}