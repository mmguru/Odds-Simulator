public class PropAccount extends Account {
    double trail;

    public PropAccount (String name, double balance, double trail, int accountNumber) {
        super(name, balance, accountNumber);
        this.trail = trail;
    }
}
