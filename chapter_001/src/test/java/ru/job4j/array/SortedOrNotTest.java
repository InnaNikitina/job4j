package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortedOrNotTest {
    @Test
    public void whenSorted() {
        SortedOrNot sort = new SortedOrNot();
        int[] input = new int[]{1, 3, 5, 9};
        boolean result = sort.sorted(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotSorted() {
        SortedOrNot sort = new SortedOrNot();
        int[] input = new int[]{5, 3, 2, 6};
        boolean result = sort.sorted(input);
        assertThat(result, is(false));
    }
}
