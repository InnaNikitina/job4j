package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstIsTheBiggest() {
        Max max3 = new Max ();
        int result = max3.max(5,2,1);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdIsTheBiggest() {
        Max max3 = new Max ();
        int result = max3.max(2,2,3);
        assertThat(result, is(3));
    }
}
