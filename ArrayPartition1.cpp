//Time Complexity O(n)
// Space Complexity O(n)
//Problem successfully executed on leetcode
//No problems faced while coading this.


#include<iostream>
#include<vector>
#include<queue>
#include<map>
#include<stack>
using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int rSum=nums[0];
        int maxi=nums[0];
        
        for(int i=1;i<nums.size();i++)
        {
            rSum=max(rSum+nums[i],nums[i]);
            maxi=max(maxi,rSum);
        }
        return maxi;
    }
};