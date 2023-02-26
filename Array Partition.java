// Time Complexity = O(nlogn)
// Space Complexity =  O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int result = 0;
        int max;
        
        for(int i = 0; i<n; i += 2){
            // max = Math.min(nums[i], nums[i+1]);
            // result += max;
            result += nums[i];
        }
        return result;
    } 
}

