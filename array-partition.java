//Time Complexity: o(n logn)
//Space Complexity: o(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        if(nums.length == 0) return result;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i+=2)
        {
            result += nums[i];
        }
        return result;
    }
}