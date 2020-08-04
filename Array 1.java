// Time Complexity : O(nlogn)
// Space Complexity: O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
	if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length-1; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}
