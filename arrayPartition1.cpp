// Time Complexity : O(nlogn) sorting
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Key Insight: Clubbing all large values would give higher sum of all min values. Since large values will otherwise get wasted
// if clubbed with smaller values since the smaller ones form the constraint 

// Your code here along with comments explaining your approach
// 1. Sort the array 
// 2. Consecutive elements now form the desired pairs
// 3. Calculate running sum of alternate elements and return it

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        if(nums.size()==0)
            return 0;
        sort(nums.begin(), nums.end());
        int sum = 0;
        for(int i=0;i<nums.size();i+=2)
            sum+=nums[i];
        return sum;
    }
};