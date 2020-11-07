public class  Instrument {
    int pricePerTick;
    String symbol;

    public Instrument (String symbol, int pricePerTick) {
        this.symbol = symbol;
        this.pricePerTick = pricePerTick;
    }

    public int getPricePerTick() {
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
