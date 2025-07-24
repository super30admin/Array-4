//Time Complexity : O(nlogn)
//Space complexity : O(1)
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int sum=0;
        for(int i=0;i<nums.size();i=i+2){
            sum += min(nums[i],nums[i+1]);
        }
        return sum;
    }
};