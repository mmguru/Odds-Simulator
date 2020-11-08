public class PropAccount extends Account {
    double trailingDrawdown;
    double trail;
    double highestPoint;

    public PropAccount (String name, double balance, double trail, int accountNumber) {
        super(name, balance, accountNumber);
        this.trail = trail;
        trailingDrawdown = balance - trail;
        highestPoint = balance;
        this.accountNumber = accountNumber;
    }

    public void checkHighest() {
        if (balance > highestPoint) {
            highestPoint = balance;
            trailingDrawdown = highestPoint - trail;
        }
    }

    public boolean liquidationReached() {
        return balance < trailingDrawdown;
    }

    public void updateTrailingDrawdown() {
        highestPoint = balance;
        trailingDrawdown = highestPoint - trail;

    }

    public double ammountBeforeLiquidation() {
        return balance - trailingDrawdown;
    }

    public void printAccountInfo() {
        System.out.println("Trade Number: " + numberTrades);
        System.out.println("Account Balance: $ " + balance);
        System.out.println("Liquidation Threshold $ " + trailingDrawdown);
        System.out.println("Amount to liquidation $ " + ammountBeforeLiquidation());
    }
}
