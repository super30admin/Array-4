/* 
    Time Complexity                              :  O(N)
    Space Complexity                             :  O(1)
    Did this code successfully run on Leetcode   :  Yes
    Any problem you faced while coding this      :  No
*/

#include <bits/stdc++.h> 
using namespace std; 


class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int sum = nums[0], mx = nums[0];
        for(int i=1;i<n;i++) {
            sum += nums[i];
            sum = max(sum, nums[i]);
            mx = max(mx, sum);
        }
        
        
        return mx;
    }
};