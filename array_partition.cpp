// # Time Complexity : O(nlogn)
// # Space Complexity : O(1)
// # Did this code successfully run on Leetcode : Yes
// # Three line explanation of solution in plain english
// # I sort the input and return alternate number starting from first index

#include <algorithm>

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        std::sort(nums.begin(), nums.end());
        int sum = 0;
        for (int i=0; i<nums.size(); i+=2) {
            sum += nums[i];
        }
        
        return sum;
    }
};
