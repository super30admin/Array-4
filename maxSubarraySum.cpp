#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
We start with the first element as the current and max subarray sum.
As we move through the array, we either extend the current subarray or start fresh from the current element.
We keep updating the max whenever the current subarray becomes larger than the max so far.
*/
class Solution{
public:
    int maxSubArray(vector<int>& nums){
        int result = nums[0], maxSum = nums[0];
        for(int i = 0; i< nums.size(); i++){
            maxSum = max(maxSum + nums[i], nums[i]);
            result = max(result, maxSum);
        }
        return result;
    }
};
