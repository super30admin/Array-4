//Time complexity : O(n)
//Space complexity : O(1)

//Approach:
            // Sort the array
            // Divide the sorted array in pairs of two
            // take the minimum of the pair and add to result
            // return the result

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        if(nums.size() == 0)
            return 0;
        
        int result = 0;
        sort(nums.begin(), nums.end());
        
        for(int i = 0 ; i < nums.size() ; i += 2)
        {
            result += nums[i];
        }
        
        return result;
    }
};