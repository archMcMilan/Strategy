package pattern;

/**
 * Created by Артем on 29.05.2016.
 */
public class QSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        arr=qSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public int[] qSort(int[] mas, int start, int finish) {
        int left = start, right = finish;
        int op = mas[(left + right) / 2];
        while (left <= right) {
            while (mas[left] < op){
                left++;
            }
            while (mas[right] > op){
                right--;

            }
            if (left <= right) {
                int temp = mas[left];
                mas[left] = mas[right];
                mas[right] = temp;
                left++;
                right--;
            }
        }
        if (start < right)
            mas = qSort(mas, start, right);
        if (finish > left)
            mas = qSort(mas, left, finish);
        return mas;
    }



}
