package quick_sort;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static quick_sort.QuickSort.sort;

class QuickSortTest {

    private  int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
    private  int[] xOut = { -3, 0, 3, 4, 7, 7, 8, 10, 12 };


    @org.junit.jupiter.api.BeforeEach
    void setUp() {


//        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void sortTest() {

//        int low = 0;
//        int high = x.length - 1;

        sort(x);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));

        Assertions.assertArrayEquals(xOut, x);

    }
}