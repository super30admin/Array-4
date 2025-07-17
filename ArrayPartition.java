// Time complexity - O(nlogn)
// Space complexity -O(1)
//Solved on leetcode - yes
//FAced any issues - NO
// Initially sorting the array and getting sum of even indices
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
        for(int i=0;i<nums.length;i=i+2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
