//TC: O(n)
//SC: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0]; int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            rSum = Math.max(rSum+nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}



class Solution {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0]; int max = nums[0];
        int start = 0; int end = 0; int k = 0;
        for(int i = 1; i < nums.length; i++){
            rSum = rSum+nums[i];
            if(rSum < nums[i]){
                rSum = nums[i];
                k = i;
            }
            if(rSum > max){
                max = rSum;
                start = k;
                end = i;
            }
        }
        System.out.println(start+" "+ end);
        return max;
    }
}
