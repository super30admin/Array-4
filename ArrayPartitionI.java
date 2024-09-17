//Problem 122: Array Partition I
//TC:O(nlogn)
//SC:O(1)

/*Steps
  Brute Force: TC: O(n!) : Find all the pairs/permutations and then find minimum of each pair and add them to get the result
  Optimal : TC:nlogn : Sort the array and add the alternative numbers starting from 1;
*/

import java.util.*;
class Solution {

    //TC: nlogn
    //SC:O(1)
    public int arrayPairSum(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
        
        Arrays.sort(nums);
        
        int i=0;
        int res =0;
        while(i<nums.length){
            res += nums[i];
            i = i+2;
        }
        
        return res;
    }
}    
