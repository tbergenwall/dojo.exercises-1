package dojo.legacy;

public class FizzBuzz {
	public String[] play(int start, int stop) {
		checkArgs(start, stop);
		int length = stop - start + 1;
		String[] array = new String[length];
		for (int i = 0; i < length; i++) {
			int test = start + i;
			if (test % 15 == 0) {
				array[i]="Fizzbuzz";
			} else if (test % 5 == 0) {
				array[i]="Buzz";
			} else if (test % 3 == 0) {
				array[i]="Fizz";
			} else {
				array[i] =  Integer.toString(test);
			}
		}
		return array;
	}

	private void checkArgs(int start, int stop) {
		if (start <= 0 || start > stop) {
			throw new IllegalArgumentException();
		}		
	}
}