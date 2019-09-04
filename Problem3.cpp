//
// Created by shazm on 9/3/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int ptr = nums.size()-1;
        while((ptr-1)>=0 && nums[ptr-1]>=nums[ptr]){
            ptr--;
        }
        if(ptr == 0){reverse(nums,ptr);return;}
        int ptr2 = nums.size()-1;
        while(nums[ptr2]<=nums[ptr-1]){
            ptr2--;
        }
        int temp = nums[ptr2];
        nums[ptr2] = nums[ptr-1];
        nums[ptr-1] = temp;
        reverse(nums,ptr);
    }
private:
    void reverse(vector<int>& nums, int begin){
        int end = nums.size()-1;
        while(end>begin){
            int temp = nums[end];
            nums[end] = nums[begin];
            nums[begin] = temp;
            end--;begin++;
        }
    }
};
