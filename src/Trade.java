import java.util.Random;

public class Trade {
    Account account;
    Instrument instrument;
    int odds;
    int numContracts;
    int stopLossTicks;
    int takeProfitTicks;
    double pNl;

    public Trade(Account account, Instrument instrument, int odds, int numContracts, int stopLossTicks, int takeProfitTicks) {
        this.account = account;
        this.instrument = instrument;
        this.odds = odds;
        this.numContracts = numContracts;
        this.stopLossTicks = stopLossTicks;

        if (takeProfitTicks < 0) takeProfitTicks *= -1;
        this.takeProfitTicks = takeProfitTicks;
    }

    public void makeTrade() {
        double tradeAmmount = numContracts * instrument.getPricePerTick();
        if (isWinner()) {
            pNl = takeProfitTicks * tradeAmmount;
            account.addToBalance(pNl);
            System.out.println("Winner: " + pNl);
        } else {
            pNl = stopLossTicks * tradeAmmount;
            System.out.println("Loser: " + pNl);
        }

        account.addToBalance(pNl);
    }

    private boolean isWinner() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);

        return randomNumber <= odds;
    }
}
