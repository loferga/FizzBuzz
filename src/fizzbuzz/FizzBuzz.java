package fizzbuzz;

public class FizzBuzz {
	
	public static String fizzbuzz(int n) {
		if (n%3 == 0) return "fizz";
		if (n%5 == 0) return "buzz";
		return Integer.toString(n);
	}
	
}