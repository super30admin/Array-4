// Approach : Maintaining a rSum and gSum
// To identify the actual subArray , need start and end to track the Max Sum Array. currStart pointer to track if the rSum or nums[i] is better.
// Time : O(n)
// Space : O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int n = nums.length;
        int rSum =nums[0]; int gSum =nums[0]; // instead of 0 we take nums[0] because if we have negative numbers in array.
        int start = 0; int end = 0; // pointers for final max subArray
        int currStart = 0; // pointer needed when individual nums is greater than rSum
        for(int i =1;i<n;i++){
            rSum = rSum+nums[i];
            if(rSum<nums[i]){
                rSum = nums[i];
                currStart = i;

            }
            if(rSum > gSum){
                gSum = rSum;
                start = currStart;
                end = i;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return gSum;
    }
}

// Approach : Maintaining a rSum and gSum
// Time : O()
// Space : O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int n = nums.length;
        int rSum =nums[0];
        int gSum =nums[0];
        for(int i =1;i<n;i++){
            rSum = rSum + nums[i];
            if(nums[i]>rSum){
                rSum = nums[i];
            }
            gSum = Math.max(gSum , rSum);
        }
        return gSum;
    }
}