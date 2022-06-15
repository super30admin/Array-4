/* 
    Time Complexity                              :  O(3*N)
    Space Complexity                             :  O(1)
    Did this code successfully run on Leetcode   :  Yes
    Any problem you faced while coding this      :  No
*/

#include <bits/stdc++.h> 
using namespace std;  


class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        
        int i = n-2;
        while(i >= 0 and nums[i+1] <= nums[i]) {
            i--;
        }
        
        if(i >= 0) {
            // swap(nums[i],nums[i+1]);
            int j = n-1;
            while(j>0 and nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        reverse(nums,i+1);
    }
    
    void reverse(vector<int>& nums, int l) {
        int r = nums.size()-1;
        while(l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
                
    void swap(vector<int>& nums, int &i, int &j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;

    }
};