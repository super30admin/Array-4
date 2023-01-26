//https://leetcode.com/problems/array-partition
//TC: o(n)
//SC: O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum += nums[i];
        }
        return sum;
    }
}
