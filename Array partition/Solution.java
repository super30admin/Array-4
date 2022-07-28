// Time complexity: O(nlogn)
//space complexity: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null) return 0;
        Arrays.sort(nums);
        int result =0;
        for(int i=0;i<nums.length;i+=2){
            result=result+nums[i];
        }
        return result;
    }
}
