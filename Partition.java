/* Time Complexity : O(NLogN)
Space Complexity : O(1)
Did it run on LeetCode : Yes
Any problems : No
*/

public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // sort the numbers intially to take every alternate number in the sum.
        
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i]; // As i is incremented by 2, we take every alternate number to the result.
        }
        return result;
    }
}
