public class Main {
    public static void main(String args[]) {
        Account account = new Account();
        Instrument nq = new Instrument("nq", 5);
        Trade trade = new Trade(account, nq, 90, 4, -21,9);

        trade.makeTrade();
        System.out.println(account.getBalance());
        int count = 0;
        while(account.getBalance() < 106000 && account.getBalance() > 97000) {
            System.out.println(++count);
            trade.makeTrade();
            System.out.println(">>" + account.getBalance());

        }

        System.out.println(account.isPropAccount());

        PropAccount paccount = new PropAccount("testing", 100000, 25000, 21);
        System.out.println(paccount.isPropAccount());
    }
}
