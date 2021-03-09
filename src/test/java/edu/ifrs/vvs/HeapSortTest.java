package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Heap Sort Test Class.
 */
public class HeapSortTest {
    /* Implementation Tests on Heap Sport Class */
    private HeapSort heapSort = new HeapSort();

    @Test
    public void orderingVetor() {
        @SuppressWarnings("checkstyle:magicnumber")
        int[] values = {9, -3, 5, 0, 1};
        @SuppressWarnings("checkstyle:magicnumber")
        int[] expectedOrder = {-3, 0, 1, 5, 9};

        heapSort.sort(values);
        assertArrayEquals(expectedOrder, values);
    }

    @Test
    public void onlyOneValue() {
        @SuppressWarnings("checkstyle:magicnumber")
        int[] values = {13};
        @SuppressWarnings("checkstyle:magicnumber")
        int[] expectedOrder = {13};

        heapSort.sort(values);
        assertEquals(expectedOrder[0], values[0]);
    }

    @Test
    public void arrayEmpty() {
        int[] values = {};

        heapSort.sort(values);
        assertTrue(values.length == 0);
    }
}
