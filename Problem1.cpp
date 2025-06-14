// Time Complexity : O(N) #of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 


// Your code here along with comments explaining your approach:
// 1. Sort array along with frequency using map and if frequency is divided by 2 and multiplied by that number we will get sum of mininmum for that pair of numbers. 
// 2. If its odd add 1 after division do this traversing map in increasing order.
// 3. Adding all such minimum numbers.

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        int n=nums.size();
        map<int,int> mp;
        for(int i=0;i<n;i++){mp[nums[i]]++;}
        int ans=0,fl=0;
        for(auto i:mp){
            if(fl==1){i.second--;fl=0;}
            ans=ans+(i.first * (i.second/2) );
            if(i.second%2==1){
                ans=ans+i.first;fl=1;}
        }
        return ans;
    }
};
