package dojo.dependency;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

public class GamerTest {

	@Test
	public void test() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) {
			@Override
			public String readLine() {
				return "1,5";
			}			
		};
		new Gamer(br).play();
	}
}
