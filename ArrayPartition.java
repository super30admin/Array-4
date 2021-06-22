import java.util.*;

// Time Complexity : O(n*n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        if(nums.length==0 || nums==null)
            return 0;
        
         Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i <nums.length; i += 2) 
            sum += nums[i];
        
        return sum;
        
    }
    
}
