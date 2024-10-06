Time:O(nlogn)
Space:O(1)

class Solution {
    public int arrayPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        int result = 0;
        for(int i=0;i<n;i=i+2)
        {
            result += nums[i];
        }
    return result;
    }
}