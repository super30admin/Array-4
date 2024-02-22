/*Time Complexity: O(2N)

Space Complexity: O(1)

Did this code successfully run on Leetcode : Yes

Approach: First find the break point, swap it with the immediate smallest element. 
From the next smallest+1 reverse the list.

Prob: 31. Next Permutation
*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
       int n = nums.size();
       int index=-1;
       for(int i=n-2;i>=0;i--){
           if(nums[i]<nums[i+1]){
               index=i;
               break;
           }
       }
       for(int i=n-1;i>=index && index!=-1;i--){
           if(nums[i]>nums[index]){
               swap(nums[i],nums[index]);
               break;
           }
       }
       reverse(nums.begin()+index+1,nums.end());
    }
};