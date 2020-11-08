public class PropAccount extends Account {
    double trailingDrawdown;
    double trail;
    double highestPoint = Double.MIN_VALUE;

    public PropAccount (String name, double balance, double trail, int accountNumber) {
        super(name, balance, accountNumber);
        this.trail = trail;
        trailingDrawdown = balance - trail;
    }

    public void checkHighest() {
        if (balance > highestPoint) {
            highestPoint = balance;
            updateTrailingDrawdown();
        }
    }

    public boolean liquidationReached() {
        return balance < trailingDrawdown;
    }

    public void updateTrailingDrawdown() {
        highestPoint = balance;
        trailingDrawdown = highestPoint - trail;

    }
}
