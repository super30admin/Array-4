// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

#include <vector>
#include <algorithm>
  
using namespace std;

class Solution {
public:
    int maxSubArray(std::vector<int>& nums) {
        int sum = INT_MIN;

        if (nums.size() == 0) {
            return INT_MIN;
        }

        if (nums.size() == 1) {
            return nums[0];
        }

        std::vector<int> dp(nums.size(), 0);

        dp[0] = nums[0];

        int max = dp[0];

        for (int i = 1; i < nums.size(); i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = std::max(max, dp[i]);
        }

        return max;
    }
};
