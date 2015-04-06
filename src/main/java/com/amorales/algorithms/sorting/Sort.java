package com.amorales.algorithms.sorting;

/**
 * @author Alex
 * @since 03.03.2015
 */
public interface Sort {

    void sort(int[] source);

    static void swap(int indexOne, int indexTwo, int[] source) {
        int temp = source[indexOne];
        source[indexOne] = source[indexTwo];
        source[indexTwo] = temp;
    }
}
