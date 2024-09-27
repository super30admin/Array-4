package array4;

public class NextPermutation {
	//Time Complexity : O(n), where n is length of nums
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public void nextPermutation(int[] nums) {
        // Find the number to be replace;
        int i = nums.length - 2;
        for(; i>=0; i--) {
            if(nums[i] < nums[i+1])
                break;
        }
        
        // Find the number to replace
        if(i != -1) {
            for(int j=nums.length - 1; j>i; j--) {
                if(nums[j] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }       
            }
        }
        
        // Swap the numbers after ith index
        int k = i + 1;
        int j = nums.length - 1;
        while(k < j) {
            int temp = nums[k];
            nums[k] = nums[j];
            nums[j] = temp;
            k++;
            j--;
        }
    }
}
