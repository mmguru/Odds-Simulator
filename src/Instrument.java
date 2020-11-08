public class  Instrument {
    double pricePerTick;
    double commission;
    String symbol;

    public Instrument (String symbol, double pricePerTick) {
        this.symbol = symbol;
        this.pricePerTick = pricePerTick;
    }

    public double getPricePerTick() {
        return pricePerTick;
    }

    public void setPricePerTick(int pricePerTick) {
        this.pricePerTick = pricePerTick;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
