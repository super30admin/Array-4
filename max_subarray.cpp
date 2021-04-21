//TC: O(n) where n is number of elements in the array
//SC: O(1)

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
     
        if(nums.empty() == 1)
            return INT_MIN;
        
        //Using Kadane's algo:
        
        int max_global = nums[0];
        int max_current = nums[0];
        
        for(int i=1; i<nums.size(); i++){
            
            max_current = max(nums[i], max_current + nums[i]);
            
            if(max_current >= max_global)
                max_global = max_current;
            
        }
        
        return max_global;
        
    }
};