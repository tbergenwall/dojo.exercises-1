package dojo.legacy;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	private static final int LENGTH = 15;
	private FizzBuzz fb;

	public FizzBuzzTest() {
		fb = new FizzBuzz();
	}

	@Test
	public void testPlayBadArgs1() {
		try {
			fb.play(0, 0);
		} catch (IllegalArgumentException e){
			return;
		}
		fail("No exception");
	}
	
	@Test
	public void testPlayBadArgs2() {
		try {
			fb.play(1, 0);
		} catch (IllegalArgumentException e){
			return;
		}
		fail("No exception");
	}
	
	@Test
	public void testPlay1() {
		assertArrayEquals(new String[]{"1"}, fb.play(1, 1));
	}
	
	@Test
	public void testPlay2() {
		assertArrayEquals(new String[]{"1", "2"}, fb.play(1, 2));
	}
	
	@Test
	public void testPlay3() {
		assertArrayEquals(new String[]{"1", "2", "Fizz"}, fb.play(1, 3));
	}
	
	@Test
	public void testPlay4() {
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4"}, fb.play(1, 4));
	}
	
	@Test
	public void testPlay5() {
//		assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, fb.play(1, 5));
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "5"}, fb.play(1, 5));
	}
	
	@Test
	public void testPlay15() {
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "5", "Fizz", "7", "8", "Fizz",
				"10", "11", "Fizz", "13", "14", "Fizzbuzz"}, fb.play(1, 15));
	}

	@Test
	public void testPlayAll() {
		for (int i = 0; i < LENGTH; i ++) {
			int start = i + 1;
			int stop = i + LENGTH;
			String[] result = fb.play(start, stop);
			assertTrue(result.length == LENGTH);
			for (int j = 0; j < LENGTH; j++) {
				if ((j + start) % 15 == 0) {
					assertTrue(result[j].equals("Fizzbuzz"));
				} else if ((j + start) % 5 == 0) {
//					assertTrue(result[j].equals("Buzz"));				
					assertTrue(result[j].equals("" + (j + start)));
				} else if ((j + start) % 3 == 0) {
					assertTrue(result[j].equals("Fizz"));
				} else {
					assertTrue(result[j].equals("" + (j + start)));
				}
			}
		}
	}
}