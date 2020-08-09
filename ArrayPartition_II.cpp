// Time Complexity : O(NLonN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Sort the array first and take the alternate elements starting from index 0 and add it to the sum.

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        if(nums.size()==0)
            return 0;
        
        sort(nums.begin(),nums.end());
        int sum =0;
        for(int i=0;i<nums.size();i=i+2){
            sum = sum+nums[i];
        }
        return sum;
    }
};
