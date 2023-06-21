// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes 

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int rSum = 0;
        int result = INT_MIN;
        for(int n:nums) {
            rSum = max(rSum+n, n);
            result = max(result, rSum);
        }
        return result;
    }
};