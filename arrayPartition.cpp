#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
We first sort the array so the smaller elements are grouped with the next bigger ones.
Then, we add every alternate element (starting from index 0) since it's the min in each pair.
This ensures the sum of mins across all pairs is maximized as required.
*/
class Solution{
public:
    int arrayPartition(vector<int>& nums){
        int n = nums.size();
        sort(nums.begin(), nums.end());
        int result = 0;
        for(int i = 0; i < n; i+=2){
            result += nums[i];
        }
        return result;
    }
    
};
