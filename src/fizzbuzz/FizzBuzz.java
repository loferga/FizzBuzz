package fizzbuzz;

public class FizzBuzz {
	
	private static final int[] MULTIPLES = {3, 5};
	private static final String[] RETOURS_ASSOCIES = {"fizz", "buzz"};
	
	public String fizzbuzz(int n) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i<MULTIPLES.length; i++)
			if (n%MULTIPLES[i] == 0)
				str.append(RETOURS_ASSOCIES[i]);
		if (str.length() == 0) str.append(Integer.toString(n));
		return str.toString();
	}
	
}