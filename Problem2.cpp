// Problem Name: Maximum subarray
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// 1. We keep track of the currSum and maxi here
// 2. For each i, we check whether we can add it to our sum, or takes nums[i]
// individually
// 3. We update the maxi with the max currSum we found at each iteration

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  int maxSubArray(vector<int> &nums) {
    int currSum = nums[0];
    int maxi = nums[0];
    for (int i = 1; i < nums.size(); i++) {
      currSum = max(nums[i], currSum + nums[i]);
      maxi = max(maxi, currSum);
    }
    return maxi;
  }
};
