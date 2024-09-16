// tc: O(nlogn) where n is length of input array
// sc: O(1) 

import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        //sort the array so that we dont waste number
        Arrays.sort(nums);
        int res = 0;
        //increase i by 2 so that we get min value from pair, since array is sorted,
        //elements at even index will have min value
        for(int i=0; i<nums.length; i= i+2){
            res += nums[i];
        }
        return res;
    }
}