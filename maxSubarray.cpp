O(N) time, O(1) space

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int rSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.size();i++){
            rSum = max(rSum+nums[i],nums[i]);
            maxSum = max(maxSum,rSum);
        }
        return maxSum;
    }
};
