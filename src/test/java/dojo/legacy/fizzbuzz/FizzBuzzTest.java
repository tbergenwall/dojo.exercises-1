package dojo.legacy.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fb;

	public FizzBuzzTest() {
		fb = new FizzBuzz();
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldFailIfStartIsZero() {
		fb.play(0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldFailIfStopGreaterThanStart() {
		fb.play(1, 0);
	}

	@Test
	public void shouldReturnOneForOne() {
		assertArrayEquals(new String[]{"1"}, fb.play(1, 1));
	}
	
	@Test
	public void shouldReturnTwoForTwo() {
		assertArrayEquals(new String[]{"1", "2"}, fb.play(1, 2));
	}
	
	@Test
	public void shouldReturnFizzForThree() {
		assertArrayEquals(new String[]{"1", "2", "Fizz"}, fb.play(1, 3));
	}
	
	@Test
	public void shouldReturnFourForFour() {
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4"}, fb.play(1, 4));
	}
	
	@Test
	public void shouldReturnBuzzForFive() {
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, fb.play(1, 5));
	}
	
	@Test
	public void shouldReturnFizzbuzzForFifteen() {
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
				"Buzz", "11", "Fizz", "13", "14", "Fizzbuzz"}, fb.play(1, 15));
	}
}