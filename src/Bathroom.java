public class Bathroom extends Room {
    private boolean brokenFaucet;

    public Bathroom (String color, double size) {
        super(color, size);
        brokenFaucet = true;
    }

    public void isFaucetBroken() {
        if (!brokenFaucet) {
            System.out.println("The faucet is broken.");
        } else {
            System.out.println("Surprisingly, the faucet is not broken.");
        }
    }
}
