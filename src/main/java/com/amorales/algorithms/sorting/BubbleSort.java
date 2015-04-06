package com.amorales.algorithms.sorting;

import static com.amorales.algorithms.sorting.Sort.*;

/**
 * @author Alex
 * @since 20.03.2015
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(int[] source) {
        for (int i = source.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (source[j] > source[j + 1]) {
                    swap(j, j + 1, source);
                }
            }
        }
    }
}
