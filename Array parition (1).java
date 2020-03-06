// Time complexity - 0(nlogn)
// space complexity - 0(1)
// Sorting is used here because if the numbers are sorted, gap elements will be smaller and minimum can be found.

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int sum =0;
        for(int i =0;i<nums.length;i=i+2){
            sum = sum + Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}