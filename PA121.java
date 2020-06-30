//Leetcode : 561. Array Partition I
//Time Complexity: O(nlogn) 
//Space Complexity: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        Arrays.sort(nums);
        int res=0;
        
        for(int i=0;i<nums.length;i=i+2){
            res=res+nums[i];
        }
        return res;
    }
}