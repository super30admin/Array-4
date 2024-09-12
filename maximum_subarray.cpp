//Time Complexity-O(n)
//Space Complexity-O(1)
//Ran successfully on leetcode

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int ans=INT_MIN,sum=0;
        for(int i=0;i<nums.size();i++)
        {
            sum=max(sum+nums[i],nums[i]);
            ans=max(sum,ans);
        }
        return ans;
    }
};