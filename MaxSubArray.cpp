// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// The maximum sum is caalcualted using local and global sum calculated at each step(Greedy approach)

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if(nums.size()==0)
            return 0;
        int currSum = nums[0],globalSum = nums[0];
        
        for(int i=1;i<nums.size();i++){
            currSum = max(nums[i],currSum+nums[i]);
            globalSum = max(currSum,globalSum);
        }
        return globalSum;
        
    }
};
