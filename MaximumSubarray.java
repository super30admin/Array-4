/*
The time complexity is O(N) and the space complexity is O(1).

Here, the intuition is to see if the currsum is positive or negative value. If negative there is no use to add the present to it.
So make the currsum to our present element. If positive than add the present element to current sum. For each iteration check if
our currentsum > max. If yes make max = currsum.

Yes, the solution passed all the test cases in leetcode.
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==1){return nums[0];}

        int max = nums[0]; int currmax = nums[0];
        for(int i=1;i<n;i++){
            if(currmax<0){
                currmax = nums[i];
            }
            else{
                currmax+= nums[i];
            }

            if(currmax>max){
                max = currmax;
            }
        }

        return max;
    }
}