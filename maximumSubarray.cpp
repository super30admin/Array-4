//time complexity:O(n)
//space complexity:O(1)
//executed on leetcode: yes
//approach:using maximum so far and maximum ends here
//any issues faced? no

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum=nums[0];
        int maxs=nums[0];
        if(nums.size()==1)
            return maxs;
        for(int i=1; i<nums.size(); i++)
        {
            if(sum+nums[i]<nums[i])
            {
                sum=nums[i];
            }
            else
            {
                sum=sum+nums[i];
            }
            maxs=max(maxs,sum);
        }
        return maxs;
    }
    
};