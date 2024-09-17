// Time complexity-O(n)
// space complexity O(1);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// find the breach 
// handle edge case when the number is in descending order
// find the number on the right to swap with
// reverse all the elements from the position where you swapped till the end of the array

#include<algorithm>
#include<vector>
using namespace std;


class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        
        if(nums.size()== 0){ return;}
         if(nums.size()== 2){ reverse(nums.begin(),nums.end());return;}
        
        
        int i = nums.size()-2; int j= nums.size()-1;
        
        // find the breach
        while(i>=0 &&  nums[i]>= nums[i+1]){
            i--;
        }
        
        // edge case
        if(i == -1){
            reverse(nums.begin(),nums.end());
            return;
        }
        
          while(nums[i]>=nums[j]){
             j--;
         }
         swap(nums[i],nums[j]);
        reverse(nums.begin()+i+1,nums.end());
    
        
    }
};