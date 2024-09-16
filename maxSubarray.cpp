// Time Complexity :O(n) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        int max_sum = nums[0];
        int curr_sum = max_sum;
        for(int i=1;i<nums.size();i++){
            curr_sum = max(nums[i],curr_sum+nums[i]);
            max_sum = max(max_sum,curr_sum);
        }
        return max_sum;
    }
};