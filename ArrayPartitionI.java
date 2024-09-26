package Dec20;

import java.util.Arrays;

class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
    	 /*
        Time complexity: O(n log n) for sorting the array
        Space complexity: O(1) 
         
        Approach:
        Sort the array and pair up two each in sequential order. Min of each pair will sum to solution.
        So, sum of alternate nos. in sorted array will be same as sum of min# in every pair.
        Given array: [1,4,3,2]
        Sorted array: [1 ,2 ,3 ,4 ]
                       ----  ----
             Pair min:   1    3
             Sum of min of every pair = 1 + 3 = 4
        */
        
        // edge
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);  // O(n log n)
        int sum = 0;
        
        for (int i = 0; i < nums.length-1; i = i+2) {
            sum += nums[i];
        }
       
        return sum;
        
    }
}