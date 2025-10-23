// Problem Name: Next Permutation
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// 1. We first find the breach where nums[i] < nums[i+1
// 2. If it's greater than 0 then, we swap it with the next greater value than
// it in the right
// 3. In the end, we reverse +1 after the breach to get the next permuation
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  void nextPermutation(vector<int> &nums) {
    int n = (int)nums.size();
    int i = n - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }
    // ith index breach
    if (i >= 0) {
      int j = n - 1;
      while (nums[i] >= nums[j])
        j--;
      swap(nums[j], nums[i]);
    }
    reverse(nums.begin() + i + 1, nums.end());
  }
};
