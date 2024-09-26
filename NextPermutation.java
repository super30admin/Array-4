package Dec20;

class NextPermutation {
    public void nextPermutation(int[] nums) {
        /*
        Approach & Time complexity:
        
        Step 1: Find point of breach.
        Step 2: Find element just greater than breach element and swap.
        Step 3: Reverse the elements after breach index.
        O(n) + O(n) + O(n) ~= O(n)
        
        Example:
        Given: 2,4,7,6,5,3,1
        After Step 1: 2,4**,7,6,5,3,1
        After Step 2: 2,5,7*,6*,4*,3*,1*
        After Step 3: 2,5,1,3,4,6,7
                        
        Note: If given array doesn't have any breach as per findings of step 1, then directly perform step 3.
        
        */
        
        // edge
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int i = n-2;
        // find point of breach
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if (i != -1) {
            // Find element just greater than breach element and swap.
            int j = n-1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        // reverse the elements after breach index
        int k = i+1;
        int l = n-1;
        int temp2 = 0;
        
        while(k < l) {
            temp2 = nums[k];
            nums[k] = nums[l];
            nums[l] = temp2;
            k++;
            l--;
        }
        
    }
}