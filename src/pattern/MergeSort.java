package pattern;

/**
 * Created by Артем on 29.05.2016.
 */
public class MergeSort implements Sorting{
    @Override
    public void sort(int[] arr) {
        arr=sortMerge(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public int[] sortMerge(int[] mas) {
        if (mas.length < 2)
            return mas;
        int middle = mas.length / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[mas.length - middle];
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = mas[i];
        }
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = mas[i + middle];
        }
        mas = merge(sortMerge(leftHalf), sortMerge(rightHalf));
        return mas;

    }

    private int[] merge(int[] arr1, int[] arr2) {
        int i1 = 0, i2 = 0;
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < result.length; i++) {
            if (i1 < arr1.length && i2 < arr2.length) {
                if (arr1[i1] > arr2[i2]) {
                    result[i] = arr2[i2];
                    i2++;
                } else {
                    result[i] = arr1[i1];
                    i1++;
                }
            } else if (i1 < arr1.length) {
                result[i] = arr1[i1];
                i1++;
            } else if (i2 < arr2.length) {
                result[i] = arr2[i2];
                i2++;
            }
        }
        return result;
    }

}
