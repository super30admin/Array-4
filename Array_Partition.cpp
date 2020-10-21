// Time Complexity : O(nlogn) traversing throught the array only once, but before that we are sorting the array.
// Space Complexity : O(1) we are not creating any space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no issues as of now.. Learning



// our goal is to form the pairs so that they have minimal difference between them.
// so for a sorted array each consecutive poairs have minmal distance between them..
// so for these pairs the first value of pair will be the minimum as the array is sorted
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        
          int n = nums.size();
        
        if(n == 0){
            return 0;
            
        }
        sort(nums.begin(), nums.end());
        
        int sum = 0;
        for (int i = 0; i < n; i+=2){
            
            sum += nums[i];
            
            
        }
        return sum;
    }
};