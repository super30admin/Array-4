class Solution {
public:
    int maxSubArray(vector<int>& nums) {
       int n = nums.size();
       int curSum = nums[0];
       int maxVal = nums[0];

       for(int i = 1; i<n;i++)
       {
           int temp = (curSum + nums[i]);
           
           curSum = max(nums[i], temp);
            maxVal = max(curSum,maxVal);
       } 

       return maxVal;
    }
};