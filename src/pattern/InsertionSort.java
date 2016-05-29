package pattern;

/**
 * Created by Артем on 29.05.2016.
 */
public class InsertionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        arr=sortInsert(arr,0);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public int[] sortInsert(int[] mas, int i) {
        i++;
        insert(mas, i);
        if (i <  mas.length) {
            mas = sortInsert(mas, i);
        }
        return mas;
    }

    private int[] insert(int[] mas, int j) {
        j--;
        if (j > 0) {
            if (mas[j - 1] > mas[j]) {
                mas[j] = mas[j - 1] + mas[j];
                mas[j - 1] = mas[j] - mas[j - 1];
                mas[j] = mas[j] - mas[j - 1];
                mas = insert(mas, j);
            }
        }
        return mas;
    }

}
