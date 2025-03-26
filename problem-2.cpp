// https://leetcode.com/problems/maximum-subarray/description/

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public:
        int maxSubArray(vector<int>& nums) {
            int n = nums.size();
            int maxSum = INT_MIN;
            int currSum = 0;
            for(int i=0; i<n; i++){
                currSum = max(currSum+nums[i], nums[i]);
                maxSum = max(currSum, maxSum);
            }
            return maxSum;
        }
    };