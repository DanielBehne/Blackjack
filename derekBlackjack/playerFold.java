public class playerFold {
    public static void fold() {
        Single finalHand = new Single();
        finalHand.getCard();
        System.out.println("You have chosen to fold. The final value of your hand is " + finalHand.finalTotal);
    }
}    