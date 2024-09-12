// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Not completely. 60% tests passed
// Any problem you faced while coding this -

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        int l = 0; 
        int h = nums.size()-1;

        // l, h in previous iteration        
        int lo = -1;
        int ho = -1;
        
        // Iterate until all elements visited
        while(l < h)
        {
            lo = l;
            ho = h;

            // -ve case  
            if(nums[l] < 0)
                l++;
            // +ve case
            else
                if(abs(nums[l+1]) > nums[l])
                    l += 2;
            
            // -ve case
            if(nums[h] < 0)
                h--;
            // +ve case
            else
                if(nums[h-1] < 0 && abs(nums[h-1]) > nums[h])
                    h -= 2;
            
            // Exit condition
            if(lo == l && ho == h)
                break;
        }
        
        int sum = 0;
        for(int i = l; i <= h; i++)
            sum += nums[i];
        
        return sum;
    }
};