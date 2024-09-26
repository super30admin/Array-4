 class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0; //base case where if the length of the nums array is 0, we return 0;
        int n = nums.length; //n stores the length of the nums array
        int rsum = nums[0], max = nums[0]; //we take 2 variables rsum and max and we initialize those variables to the first element in the array
        for(int i = 1; i < n; i++) { //we go through the array
            rsum = Math.max(rsum + nums[i], nums[i]); //we compute the rsum;
            if(rsum > max) { //if the rsum is greater than max value,
                max = rusm; // we update the max
            }
        }
        return max; //in the end, we return max
    }
 }
 //tc and sc - O(n) and O(1)