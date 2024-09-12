//Time - O(n)
//Space - O(1)
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int curMax = nums[0], ans = nums[0];
        
        for(int i=1;i<nums.size();i++){
            curMax = max(nums[i], nums[i]+curMax);
            ans = max(ans,curMax);
        }
        return ans;
    }
};