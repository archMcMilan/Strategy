package pattern;

/**
 * Created by Артем on 29.05.2016.
 */
public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient client=new StrategyClient();

        int arr0[]={1,3,7,5,2,6,1,7,0};
        client.setStrategy(new QSort());
        client.executeStrategy(arr0);

        int arr1[]={1,3,7,5,2,6,1,7,0};
        client.setStrategy(new InsertionSort());
        client.executeStrategy(arr1);

        int arr2[]={1,3,7,5,2,6,1,7,0};
        client.setStrategy(new MergeSort());
        client.executeStrategy(arr2);
    }
}
