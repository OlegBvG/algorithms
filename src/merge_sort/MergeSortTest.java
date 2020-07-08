package merge_sort;

import static merge_sort.MergeSort.mergeSort;

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortTest {

  private int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3};
  private int[] xOut = {-3, 0, 3, 4, 7, 7, 8, 10, 12};

  @BeforeEach
  void setUp() {
    System.out.println("Было");
    System.out.println(Arrays.toString(x));
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void mergeSortTest() {
    mergeSort(x);
    System.out.println("Стало");
    System.out.println(Arrays.toString(x));

    Assertions.assertArrayEquals(xOut, x);
  }
}