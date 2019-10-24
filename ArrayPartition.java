/*
The time comlexity is O(NlogN) and the space complexity is O(1)

Here the intuition is to return the max result possible when we pair our numbers in nums array and get the min of each pair.
So, to get the max we can pair (2nd max element,maxelement) and get min of this pair as 2nd max element. We do the same kind of pairing
for each and add it to an variable.

Yes, the solution passed all the test cases in leet code.
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        //Since we already sorted the array pick alternate element starting from index 0.
        for(int i=0;i<nums.length;i = i+2){
            sum = sum+nums[i];
        }

        return sum;
    }
}