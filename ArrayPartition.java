// TC = O(nlogn)
// SC = O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;
        for(int i=0; i<n; i = i+2){
            res = res + nums[i];
        }
        return res;
    }
}