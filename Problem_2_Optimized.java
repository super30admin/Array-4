// Time complexity - O(n)
// Space complexity - O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int start = 0; int end = 0;
        int rSum = 0;
        int k = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length; i++){
            rSum = rSum + nums[i];
            if(nums[i] > rSum){
                k = i;
                rSum = nums[i];
            }
            if(rSum > max){
                start = k;
                end = i;
                max = rSum;
            }
        }
        System.out.println(start+" - "+end);
        return max;
    }
}

// 
 class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int localSum = nums[0]; int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            localSum = Math.max(localSum,localSum+nums[i]);
            max = Math.max(max,localSum);
        }
        return max;
    }
}
