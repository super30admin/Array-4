// TC - O(nlogn), SC - O(logn)

// LC - 561

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
		// sort array
        Arrays.sort(nums);
        int sum = 0;
		// summ every alternate number in array from starting
        for(int i=0; i<nums.length; i=i+2){
            sum += nums[i];
        }
        return sum;
    }
}