//
// Created by shazm on 9/3/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum = 0; int maxVal = INT_MIN;
        for(int x = 0; x<nums.size(); x++){
            sum+=nums[x];
            if(sum<nums[x]){
                sum = nums[x];
            }
            maxVal = max(maxVal,sum);
        }
        return maxVal;
    }
};