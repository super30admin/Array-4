// Time Complexity : O(n*logn)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this -

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        
        int len = nums.size();
        int total = 0;
        int a, b, i;
        
        
        for(i = 0; i < len; i++)
        {
            a = nums[i];
            i++;
            b = nums[i];
            
            total += min(a,b);
        }
        
        return total;
    }
};