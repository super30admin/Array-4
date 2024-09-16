class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        int n=nums.size();
        
        if(n==0)
            return 0;
        
        int total_max=nums[0],maxi=nums[0];
        for(int i=1;i<n;i++)
        {
            maxi=max(nums[i],maxi+nums[i]);
            total_max=max(maxi,total_max);
        }
        
        return total_max;
    }
};