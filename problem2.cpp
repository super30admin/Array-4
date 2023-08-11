/*
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max_num{-10000},r_sum{-10000};
        for(auto& i:nums){
            r_sum = max(r_sum+i,i);
            max_num = max(max_num,r_sum);
        }
        return max_num;
    }
};