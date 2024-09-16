// Time Complexity :O(nlogn) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int sum = 0;
        for(int i=0; i < nums.size(); i+=2){
            sum+=nums[i];
        }
        return sum;
    }
};