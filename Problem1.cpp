/* Problem Statement:

VERIFIED ON LEETCODE PLATFORM 
561. Array Partition I
Easy

Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:

Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

Note:

    n is a positive integer, which is in the range of [1, 10000].
    All the integers in the array will be in the range of [-10000, 10000].


 * Solution 1: using sorting  
   Time Complexity : O(nlogn)
 * Space complexity :O(1)
 */

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        int len = nums.size();
        int final_ans = 0;
        int idx = 0;
      
        /* corner cases */
        if (len == 0) {
            return final_ans;
        } else if (len == 1) {
            return nums[0];
        }  
        /* sort the array */
        sort(nums.begin(), nums.end());
        
        /* find min among pairs one at a time and add it to final answer */
        for (idx = 0; idx < len; idx+=2) {
            final_ans += min(nums[idx],nums[idx+1]);
        }
        return final_ans;
    }
};
/* Execute on leetcode platform */


