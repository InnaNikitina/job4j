package ru.job4j.array;

import java.util.Arrays;

public class TwoSortedArrays {
    public int[] summArrays(int[] first, int[] second) {
        int[] summ = new int[first.length + second.length];
        int length;

        if (first.length > second.length) {
            length = second.length;
        } else {
            length = first.length;
        }
        for (int i = 0; i < length; i++) {
            if (first[i] > second[i]) {
                summ[i] = second[i];
                summ[i + 1] = first[i];
            } else {
                summ[i] = first[i];
                summ[i + 1] = second[i];
            }
        }


        return summ;
    }
}
