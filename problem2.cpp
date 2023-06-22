// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int rsum = nums[0];
        int mx = nums[0];
        
        for(int i = 1;i<n;i++){
            rsum = max(rsum+nums[i],nums[i]);
            mx = max(mx,rsum);
        }
        return mx;
    }
};