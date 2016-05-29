package pattern;

/**
 * Created by Артем on 29.05.2016.
 */
//Context
public class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int arr[]){
        strategy.sort(arr);
    }
}
