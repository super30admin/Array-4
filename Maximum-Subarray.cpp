// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if(nums.size()==0){
            return 0;
        }
        int rmax = nums[0], maxi = nums[0];
        for(int i=1; i<nums.size();i++){
            rmax = max(rmax+nums[i], nums[i]);
            maxi = max(maxi, rmax);
        }
        return maxi;
    }
};
