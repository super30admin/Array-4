561. Array Partition

Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

TC O(nlogn) // sort and loop over nums
SC O(1)


class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int result = 0;
        for (int i=0; i < nums.size(); i = i+2) {
                result += nums[i];
        }
        return result;
    }
};
