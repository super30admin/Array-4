/**
 * 
 */

/**
 * @author Aditya Sinha
 * 
 * scan from the right to find the first drop (breach/smallest number).
 * swap it with the next greater element on the right.
 * reverse everything to the right of the breach to get the next permutation.
 * 
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class NextPermutation {
	public void nextPermutation(int[] nums) {
        int n = nums.length;

        // identify the breach
        int i = n-2;

        while(i>=0 && nums[i] >= nums[i+1]) i--;

        if(i >=0){
            // get the just bigger number
            int j = n-1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);
    }

    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums, l, r);
            l++; r--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
