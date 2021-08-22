package Recursion;

import java.awt.List;
import java.util.HashSet;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in
 * nums.
 * 
 * 
 * 
 * 
 * 
 * Input: nums = [4,3,2,7,8,2,3,1] Output: [5,6]
 * 
 * @author u0982683
 *
 */
public class DissapearingNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> missingNumbers = new ArrayList<Integer>();
		HashSet<Integer> numbers = new HashSet<Integer>();
		for (int num : nums) {
			numbers.add(num);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (!numbers.contains(i)) {
				missingNumbers.add(i);
			}
		}
		return missingNumbers;
	}

}
