// TC : O(nlogn)
// SC : O(1)
// Technique : Sorting
class Solution {
    public int arrayPairSum(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + nums[i];
            i++;
        }
        return sum;
    }
}
