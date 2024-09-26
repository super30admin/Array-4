// Time Complexity : O(nlogn) (for sorting)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//to make the most of the larger numbers and keep increasing the minimum num in each pair, we need to sort the array
//and consider adjacent numbers as pairs (even index, even index+1)
//so all our minimum elements will be present in even indices and we just have to iterate over the loop for them
//return the total

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int total=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
          total+=nums[i];  
        }
        return total;
    }
}