package quick_sort;


public class QuickSort {

  public static void sort(int[] array) {
    if (array.length <= 1) {
      return;
    }
    sort(array, 0, array.length - 1);
  }

  private static void sort(int[] array, int from, int to) {

      if (array.length == 0) {
          return;
      }

      if (from >= to) {
          return;
      }

    int middle = from + (to - from) / 2;
    int pivot = array[middle];

    int i = from, j = to;

    while (i <= j) {
      while (array[i] < pivot) {
        i++;
      }

      while (array[j] > pivot) {
        j--;
      }

      if (i <= j) {//меняем местами
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    }

      if (from < j) {
          sort(array, from, j);
      }

      if (to > i) {
          sort(array, i, to);
      }

  }


}

