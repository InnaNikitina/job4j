package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenFindIndexOf5Then0() {
        FindLoop find = new FindLoop();
        int[] data = new int[]{5, 8, 9};
        int a = 5;
        int result = find.indexOf(data, a);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindIndexOf3ThenNotFound() {
        FindLoop find = new FindLoop();
        int[] data = new int[]{4, 6, 8, 9};
        int a = 3;
        int result = find.indexOf(data, a);
        int expect = -1;
        assertThat(result, is(expect));

    }

}
