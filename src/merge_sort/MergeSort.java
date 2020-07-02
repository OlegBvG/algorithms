package merge_sort;

public class MergeSort
{
    public static void mergeSort(int[] array)
    {
        if (array.length <= 1) {
            return ;
        }
        int n = array.length;
        int middle = n / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            rightArray[i - middle] = array[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] array, int[] left, int[] right)
    {


        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                array[i] = left[i1];
                i1++;
            } else {
                array[i] = right[i2];
                i2++;
            }
        }
    }

}
