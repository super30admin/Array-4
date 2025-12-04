/**
 * 
 */

/**
 * @author Aditya Sinha
 * start with the first element as the current and max subarray sum.
 * move through the array, either extend the current subarray or start fresh from the current element
 * keep updating the max whenever the current subarray becomes larger than the max so far
 * 
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class MaximumSubarray {
	 public int maxSubArray(int[] nums) {
	        int n = nums.length;
	        int currSubArr = nums[0];
	        int maxSubAr = nums[0];

	        for(int i=1; i<n; i++){
	            currSubArr = Math.max(nums[i], currSubArr+nums[i]);
	            maxSubAr = Math.max(maxSubAr, currSubArr);
	        }

	        return maxSubAr;
	    }
}
