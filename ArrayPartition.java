class Solution {
    //tc-nlogn
    //sc-o(1)
    public int arrayPairSum(int[] nums) {
        int result =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2)
        {
            result+= nums[i];
        }
      return result;
    }
}