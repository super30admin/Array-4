//TC: O(NLogN)
//SC: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null||nums.length==0) return 0;

        Arrays.sort(nums);
        int max =0;
        for(int i=0;i<nums.length;i=i+2)
        {
            max+=nums[i];
        }

        return max;
    }
}