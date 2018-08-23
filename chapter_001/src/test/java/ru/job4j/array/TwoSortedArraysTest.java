package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TwoSortedArraysTest {
    @Test
    public void whenTwoArraysWithDifferentLength() {
        TwoSortedArrays one = new TwoSortedArrays();
        int[] inputFirst = new int[]{1, 5, 9, 11};
        int[] inputSecond = new int[]{4, 4, 5, 5, 6, 6, 8};
        one.summArrays(inputFirst, inputSecond);
        int[] result = new int[]{1, 4, 4, 5, 5, 5, 6, 6, 8, 9, 11};
        assertThat(result, is(result));
    }

}
