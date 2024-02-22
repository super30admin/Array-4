/*Time Complexity: O(N) + O(max-min)

Space Complexity: O(N)

Did this code successfully run on Leetcode : Yes

Approach: Bucket sort - Find the min and max element, store the freq in hash map.
start forming pairs based on the hashmap freq.

Prob: 561. Array Partition
*/
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        int n = nums.size();
        int maxVal = INT_MIN;
        int minVal = INT_MAX;
        unordered_map<int,int> mp;
        for(auto num : nums){
            mp[num]++;
            maxVal = max(maxVal,num);
            minVal = min(minVal,num);
        }
        int res = 0;
        bool slotAvail = false;
        for(int i=minVal;i<=maxVal;i++){
            if(mp.find(i) != mp.end()){
                if(slotAvail){
                    mp[i]--;
                }
                int count = mp[i];
                int pairs = count/2;
                res += pairs*i;
                if(count % 2 != 0){
                    res += i;
                    slotAvail = true;
                }
                else{
                    slotAvail = false;
                }
            }
        }
        return res;
    }
};