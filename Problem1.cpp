// Problem Name: Array partition
// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// 1. The observation here is we need to minimize the difference between pairs
// 2. This is only possible when we keep them close which means sorted
// 3. Then we take the alternate values, since it will be minimum for the pair
// and add it to the final sum

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  int arrayPairSum(vector<int> &nums) {
    int sum = 0;
    sort(nums.begin(), nums.end());
    for (int i = 0; i < nums.size(); i += 2) {
      sum += nums[i];
    }
    return sum;
  }
};
