// TC = O(n) -- using running sum pattern
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        int subSum = nums[0];
        int start = 0;
        int end = 0;
        for(int i=1;i<n;i++){
            subSum = subSum + nums[i];
            if(subSum < nums[i]){
                subSum = nums[i];
                start = i;
            }
            if(max<subSum){
                max = subSum;
                end = i;
            }
        }
        // System.out.println(start+" "+end); //to get the start and end index of the maximum subarray
        return max;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = nums[0];
//         int n = nums.length;
//         int currSum = nums[0];
//         for(int i=1;i<n;i++){
//             currSum = Math.max(currSum+nums[i],nums[i]);
//             max = Math.max(max, currSum);
//         }
//         // System.out.println(start+" "+end); //to get the start and end index of the maximum subarray
//         return max;
//     }
// }