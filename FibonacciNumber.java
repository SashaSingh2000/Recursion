package Recursion;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
 * Fibonacci sequence, such that each number is the sum of the two preceding
 * ones, starting from 0 and 1
 * 
 * @author u0982683
 *
 */
public class FibonacciNumber {

	public int fib(int n) {

		// Has to be greater than 0 and 1
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		// same each time
		int first = 0;
		int second = 1;
		int sum = first + second;

		// F(n) = F(n - 1) + F(n - 2), for n > 1.
		while (n > 1) {
			sum = first + second;
			first = second;
			second = sum;

			n--;
		}

		return sum;

	}
}
