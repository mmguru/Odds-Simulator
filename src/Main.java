public class Main {
    public static void main(String args[]) {
        Account account = new Account();
        Instrument nq = new Instrument("nq", 5);
        Trade trade = new Trade(account, nq, 70, 3, -21,9);

        trade.makeTrade();
        System.out.println(account.getBalance());
        while(account.getBalance() < 101000 && account.getBalance() > 0) {
            trade.makeTrade();
            System.out.println(">>" + account.getBalance());
        }
    }
}
