//as taught by sir 
class Solution {
public:
    int maxSubArray(vector<int> &nums) {
        int ans=nums[0],i,sum=0;
        int count = 0;
        
        for (i=0;i< nums.size();++i)
        {
            //if(nums[i]>0) 
            sum+=nums[i];
            ans = max(sum,ans);
            sum = max (sum,0);
            
        }
        return ans;
    }
};
