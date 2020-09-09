//Time Complexity :O(n), size of array
//Space Complexity :O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/**Step 1 : Finding Breach
 * We iterate from end of the array and find the number which is less than its next number,
 * iterate again from end and find the number greater than number at index, 
 * Step 2: Swap
 * swap the numbers at these two indices
 * Step 3: Reverse
 * Now reverse all the numbers from index till end.
 * **/

class Next_Permutation {
	public void nextPermutation(int[] nums) {
		if(nums == null || nums.length == 0)
			return;

		int n = nums.length;
		int i = n-2;    //will start checking at second last value;
		//Step1: find breach
		while(i>=0 && nums[i] >= nums[i+1]){     // if value is greater than next...keep moving
			i--;    // we stop when we find a breach i.e  value at i is less than next value
		}
		//Step2: Find element to be swapped
		int j = n-1;
		if(i >=0){  // till i is present i.e there is a breach
			while(nums[i] >= nums[j]){  // reach the point where the value is just greater than value at i
				j--;
			}
			swap(nums, i, j);
		}
		//Step3: Reverse the numbers
		reverse(nums, i+1, n-1);
	}
	private void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	private void reverse(int[] nums, int i, int j){
		while(i < j){
			swap(nums, i, j);
			i++;
			j--;
		}
	}
}