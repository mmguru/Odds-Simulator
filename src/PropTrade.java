public class PropTrade extends Trade {
    Day day;
    PropAccount account;
    Instrument instrument;
    int odds;
    int numContracts;
    int stopLossTicks;
    int takeProfitTicks;

    public PropTrade(Day day, PropAccount account, Instrument instrument, int odds, int numContracts, int stopLossTicks, int takeProfitTicks) {
        this.day = day;
        this.account = account;
        this.instrument = instrument;
        super.odds = odds;
        this.numContracts = numContracts;
        this.stopLossTicks = stopLossTicks;
        this.takeProfitTicks = takeProfitTicks;
    }

    @Override
    public void makeTrade() {
        double tradeAmmount = numContracts * instrument.getPricePerTick();
//        if (account.ammountBeforeLiquidation() - tradeAmmount < 0) {
//            System.out.println("Cannot place order");
//            return;
//        }
        if (isWinner()) {
            pNl = takeProfitTicks * tradeAmmount;
            System.out.println("Winner: " + pNl);
            day.incrementWinCount();
        } else {
            pNl = stopLossTicks * tradeAmmount;
            System.out.println("Loser: " + pNl);
            day.incrementLossCount();
        }

        account.addToBalance(pNl);
        account.incrementTrade();
        account.checkHighest();
        day.addToProfit(pNl);
    }

}
