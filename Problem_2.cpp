/**
 * @Time Complexity:
 * O(N) where N is the number of elements in the array
 * 
 */

/**
 * @Space Complexity:
 * O(1)
 * 
 */

/**
 * Approach:
 * If we move from left to right we observe that whenever our sum
 * was getting decreased on adding new values, we should not move
 * further and reset our current subarray. Otherwise, we keep on
 * going. It is based on Kadane's algorithm.
 * 
 * 
 * We can also get the exact subarray too. We need to maintain
 * two extra pointers for it. Because i will always be pointing
 * to the end of the current subarray. So, whenever we have 
 * our currSum + nums[i] <nums[i], we know we have to start
 * again so the start point of currSum is i and the initial
 * value of currSum will be nums[i]. Otherwise, currSum will
 * be currSum + nums[i].
 * 
 * Now, the third condition is when our currSum becomes greater
 * than maxSum. The maxStart will be currStart and maxEnd will be i
 * and maxSum will be rSum.
 */


class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        
        for(int i =1; i<nums.size(); i++){
            int x = nums[i];
            currSum = max(x, currSum +x);
            maxSum = max(currSum, maxSum);
        }
        return maxSum;
    }
};