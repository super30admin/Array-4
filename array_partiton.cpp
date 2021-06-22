// Time complexity-O(nlogn)
// space complexity O(1);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// sort the array
// the idea is to save the bigger numbers for upcoming pairs so we can have a maximum pair sum

#include<algorithm>
#include<iostream>
#include<vector>
using namespace std;




class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int result=0;
        for(int i =0;i<nums.size();i+=2){
           result += nums[i]; 
        }
        
        return result;
    }
};