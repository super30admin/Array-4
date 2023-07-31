/*
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
Start from the last index
You find the index where the number is smaller than its previous number.
Find the number smaller than the number found at idx from the last index.
Swap those numbers and reverse the nums vector from i+1
*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
    void swap(int& a,int& b){
        int temp = a;
        a = b;
        b = temp;
    }
    void reverse(vector<int>&nums,int i){
        int j = nums.size() - 1;
        while(i<j){
            swap(nums.at(i),nums.at(j));
            i++;
            j--;
        }
    }
public:
    void nextPermutation(vector<int>& nums) {
        int sz = nums.size();
        if (sz == 1) return;
        int i{sz-2};
        for(;i>=0;i--){
            if(nums.at(i)<nums.at(i+1)) break;
        }
        if(i>-1){
            for(int j{sz-1};j>=0;j--){
                if(nums.at(j)>nums.at(i)){
                    swap(nums.at(j),nums.at(i));
                    break;
                }
            }
        }
        reverse(nums,i+1);
    }
};