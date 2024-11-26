// TC: O(N)
// SC: O(1)
// Did it run successfully on Leetcode? : Yes
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        
        for ( int i = 1; i < nums.length; i++)
        {
            currSum = Math.max(nums[i], nums[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}


//follow up - to print the array
// TC: O(N)
// SC: O(1)
// Did it run successfully on Leetcode? : Yes
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = nums[0];
//         int currSum = nums[0];
//         int start = 0;
//         int end = 0;
//         int k = 0;
//         for ( int i = 1; i < nums.length; i++)
//         {
//             currSum = currSum + nums[i];
//             if ( currSum < nums[i])
//             {
//                  currSum = nums[i];
//                  k = i;
//             }
//             if (currSum > maxSum)
//             {  
//                 maxSum = currSum;
//                 start = k;
//                 end = i;
//             }
//         }
//         System.out.println(start + " " + end);
//         System.out.println("Array is = " );
//         for (int i = start; i <= end; i++)
//         {
//             System.out.println(nums[i]);
//         }
//         return maxSum;
//     }
// }
