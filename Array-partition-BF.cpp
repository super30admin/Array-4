/*Time Complexity: O(N log N)

Space Complexity: O(1) 

Did this code successfully run on Leetcode : Yes

Approach: Sort the array. Sum the first number from the pair and return.

Prob: 561. Array Partition
*/
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int res = 0;
        for(int i=0;i<nums.size();i=i+2){
            res += nums[i];
        }
        return res;
    }
};