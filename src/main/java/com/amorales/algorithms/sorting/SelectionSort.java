package com.amorales.algorithms.sorting;

import static com.amorales.algorithms.sorting.Sort.*;

/**
 * @author Alex
 * @since 20.03.2015
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(int[] source) {

        for (int i  = 0; i < source.length; i++) {
            int min = i;
            for (int j = i + 1; j < source.length; j++) {
                if (source[min] > source[j]) {
                  min = j;
                }
            }

            swap(min, i, source);

        }


    }
}
