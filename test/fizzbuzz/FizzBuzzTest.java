package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	private FizzBuzz fb;

	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	void fizz_un() {
		assertEquals(fb.fizzbuzz(1), "1");
	}
	
	@Test
	void fizz_deux() {
		assertEquals(fb.fizzbuzz(2), "2");
	}
	
	@Test
	void fizz_trois() {
		assertEquals(fb.fizzbuzz(3), "fizz");
	}
	
	@Test
	void fizz_quelques_valeurs() {
		assertEquals(fb.fizzbuzz(4), "4");
		assertEquals(fb.fizzbuzz(7), "7");
	}
	
	@Test
	void fizz_cinq() {
		assertEquals(fb.fizzbuzz(5), "buzz");
	}
	
	@Test
	void fizz_multiples() {
		assertEquals(fb.fizzbuzz(6), "fizz");
		assertEquals(fb.fizzbuzz(10), "buzz");
		assertEquals(fb.fizzbuzz(9), "fizz");
		assertEquals(fb.fizzbuzz(400), "buzz");
	}
	
	@Test
	void fizz_multiples_doubles() {
		assertEquals(fb.fizzbuzz(15), "fizzbuzz");
		assertEquals(fb.fizzbuzz(4 * 3 * 5), "fizzbuzz");
		assertEquals(fb.fizzbuzz(3 * 3 * 5 * 5), "fizzbuzz");
	}

}
