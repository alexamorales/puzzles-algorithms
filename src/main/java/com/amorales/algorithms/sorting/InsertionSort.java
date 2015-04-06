package com.amorales.algorithms.sorting;

/**
 * @author Alex
 * @since 03.03.2015
 */

import static com.amorales.algorithms.sorting.Sort.*;

/**
 * Contains method for sorting array using Insertion sort algorithm
 */
public class InsertionSort implements Sort {

    @Override
    public void sort(int[] source) {
        for (int i = 1; i < source.length; i++) {
            int j = i;
            while (j > 0 && source[j] < source[j - 1]) {
                swap(j, --j, source);
            }
        }

    }
}
