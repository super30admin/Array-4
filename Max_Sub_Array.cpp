// Time Complexity : O(n) as we are travelling on the array only once
// Space Complexity : O(1) we are not creating any space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no issues as of now.. Learning

// for each element we will have two options
    ///1. include current element to previous array
    ///2 or start e new array from this current index.

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        
        int sum = 0; // starting from 0 and the current elements sum will be zero at the start or index before 0
        int result = INT_MIN; // as we will be comparing with sum. i.e there is a possbility that sum can be negative tooo. So initializing with INT_MIN
        
        if(nums.size() == 0){
            return 0;
        }
        for( int i = 0; i < nums.size() ; i++){
            
            sum = max(sum + nums[i], nums[i]);
            
            result = max(result, sum);
            
        }
  return result;
    }
};