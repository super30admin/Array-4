/*Time Complexity: O(N)

Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes

Approach: Kadens algo - consider the subarray's with positive sum only.

Prob: 53. Maximum Subarray
*/
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        long long maxi = LONG_MIN;
        long long sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum > maxi){
                maxi = max(sum,maxi);
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
};