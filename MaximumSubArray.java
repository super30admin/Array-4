// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// at every step we check if the rolling sum + current element is greater or
// the next element itself is greater and accordingly update our rolling sum and the
// global maximum we are maintaining. Also, in the follow up question we maintain
// the actual start and end of the array indices and update them only when our max changes
// while the new current array's start only changes when we change the current array
// i.e when the element itself is greater than adding it into the current sum.
class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];

        int start = 0;

        int currSum = 0;

        int end = 0;

        int curr = 0;

        for(int i = 0; i < nums.length; i++){

            if(currSum + nums[i] < nums[i]) curr = i;

            currSum = Math.max(currSum + nums[i], nums[i]);

            if(currSum > maxSum){
                start = curr;
                end = i;
                maxSum = currSum;
            }


        }

        System.out.println("start " + start);
        System.out.print( "end: " + end );
        return maxSum;

    }
}
