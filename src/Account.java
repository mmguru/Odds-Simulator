public class Account {
    static int defaultAcctNumber = 1;
    static int tradeCount = 0;
    String name;
    double balance;
    int accountNumber;
    int numberTrades = 0;

    public Account() {
        this("Acct " + defaultAcctNumber, 100000, defaultAcctNumber++);
    }

    public Account(double balance) {
        this("Acct " + defaultAcctNumber, balance, defaultAcctNumber++);
    }

    public Account(String name) {
        this(name, 100000, defaultAcctNumber++);
    }

    public Account(String name, double balance) {
        this(name, balance, defaultAcctNumber++);
    }

    public Account(String name, double balance, int accountNumber) {
        this.name = name;
        this.balance= balance;
        this.accountNumber = accountNumber;
    }

    public void addToBalance(double ammount) {
        balance += ammount;
    }

    public static int getDefaultAcctNumber() {
        return defaultAcctNumber;
    }

    public static void setDefaultAcctNumber(int defaultAcctNumber) {
        Account.defaultAcctNumber = defaultAcctNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isPropAccount() {
        return this instanceof PropAccount;
    }

    public void printAccountInfo() {
        System.out.println("Account Balance: $ " + balance);
    }

    public void incrementTrade() {
        numberTrades++;
    }
}
