public class Day {
    int netProfitStop;
    int netLossStop;
    int winCount;
    int lossCount;
    double dailyProfit;

    public Day() {
        netProfitStop = 3;
        netLossStop = -6;
        winCount = 0;
        lossCount = 0;
        dailyProfit = 0;
    }

    public void addToProfit(double ammount) {
        dailyProfit += ammount;
    }

    public void incrementWinCount() {
        winCount++;
    }
    public void incrementLossCount() {
        lossCount++;
    }

    public boolean endDay() {
        return winCount - lossCount >= 3 || winCount - lossCount <= -6;
    }

    public void printInfo() {
        System.out.println("Net wins: "+ (winCount - lossCount));
        System.out.println("Daily Profit: $ " + dailyProfit);
    }



}
