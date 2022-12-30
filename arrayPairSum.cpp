// Time Complexity : O(nlogn) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes 

/*
0 10 5 4 50 1 7 9
To get the max of every pair, sort it
0 1 4 5 7 9 10 50
This way we avoid wasting big numbers my pairing them up with the next biggest available number
*/
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        if(nums.size() == 0) return 0;
        int result = 0;
        sort(nums.begin(), nums.end());
        for(int i = 0; i<nums.size(); i += 2) {
            result += nums[i];
        }
        return result;
    }
};