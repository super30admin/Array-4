
public class Next_Permutation {
	//Approach: Follow steps 1, 2, 3 for finding the next permutation
	public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int i=nums.length-2; int j = nums.length-1;
        //step - 1 : finding breach
        while( i >= 0 && (nums[i] >= nums[i+1]))
        {
                i--;
        }
        //step -2 : finding which number to be replaced with the breached number with help of j pointer
        if(i >= 0)
        {
            while(nums[j] <= nums[i])
            {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //step  -3 - reverse all the numbers after i
        reverse(nums, i+1, nums.length-1);
    }
    private void reverse(int[] nums, int start, int end)
    {
        
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
//Time Complexity : O(n) for each step
//Space Complexity : O(1)
//Did this code successfully run on Leetcode :
//Any problem you faced while coding this :