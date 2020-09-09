//TC: O(n log n)
//SC: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i = i+2){
            res += nums[i];
        }
        return res;
    }
}
