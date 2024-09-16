//Time complexity : O(n)
//Space complexity : O(1)

//Approach:
            // Keep track of max and running sum
            // for every element, take the maximum between element, element  + running sum
            // for every element, check whether running sum is greater than max if it is then update max

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if(nums.size() == 0)
            return 0;
        
        int result = nums[0], rsum = nums[0];
    
        for(int i = 1 ; i < nums.size(); i++)
        {
            rsum = max(rsum + nums[i], nums[i]);
            result = max(rsum, result);
        }
        
        return result;
    }
};