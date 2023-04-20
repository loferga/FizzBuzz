package fizzbuzz;

public class FizzBuzz {
	
	public String fizzbuzz(int n) {
		StringBuilder str = new StringBuilder();
		if (n%3==0) str.append("fizz");
		if (n%5==0) str.append("buzz");
		if (str.length() == 0) str.append(Integer.toString(n));
		return str.toString();
	}
	
}