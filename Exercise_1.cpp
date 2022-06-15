/* 
    Time Complexity                              :  O(N) - fixed time
    Space Complexity                             :  O(1)
    Did this code successfully run on Leetcode   :  Yes
    Any problem you faced while coding this      :  No
*/

#include <bits/stdc++.h> 
using namespace std;  

https://leetcode.com/problems/array-partition-i/

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(auto num : nums) {
            mp[num]++;
        }
        int f = 0, ans =0;
        for(int i=-10000;i<=10000;) {
            if(mp[i] > 0 and f == 0) {
                ans += i;
                mp[i]--;
                f = 1;
            } else if (mp[i] > 0 and f == 1) {
                mp[i]--;
                f = 0;
            } else {
                i++;
            }
        }
        return ans;
    }
};