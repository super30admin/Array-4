#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
We scan the array from the right side to find the breach
Then we swap it with the next greater element on the right
Finally we reverse everything to the right of the breach to get the next permutation
*/
class Solution{
public:
    void nextPermutation(vector<int>& nums){
        int n = nums.size();
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;

        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]) j--;
            swap(nums[j], nums[i]);
        }

        int a = i+1;
        int b = n-1;
        while(a < b){
            swap(nums[a], nums[b]);
            a++;
            b--;
        }
    }
};
