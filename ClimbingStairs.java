package Recursion;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * 
 * 
 * 
 * Input: n = 2 Output: 2 Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step 2. 2 steps
 * 
 * @author u0982683
 *
 */
public class ClimbingStairs {

	public int climbStairs(int n) {
		if (n <= 1) {
			return 1;
		}
		int[] steps = new int[n + 1];
		steps[0] = 1;
		steps[1] = 1;

		for (int i = 2; i <= n; i++) {
			steps[i] = steps[i - 2] + steps[i - 1];
		}
		return steps[n];
	}

}
