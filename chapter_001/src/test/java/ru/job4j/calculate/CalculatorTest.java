package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	@Test
	public void whenSubstractOneFromTwoThenOne() {
		Calculator calc =  new Calculator();
		calc.substract(2D, 1D);
		double result = calc.getResult();
		double expected = 1D;
        assertThat(result, is(expected));
	}
	
	@Test
	public void whenDivideSixByThreeThenTwo() {
		Calculator calc =  new Calculator();
		calc.div(6D, 3D);
		double result = calc.getResult();
		double expected = 2D;
        assertThat(result, is(expected));
	}
	
	@Test
	public void whenMultipleThreeOnThreeThenNine() {
		Calculator calc =  new Calculator();
		calc.multiple(3D, 3D);
		double result = calc.getResult();
		double expected = 9D;
        assertThat(result, is(expected));
	}
}
