/*
The idea is that we can form all possible pairs get their minimum and compare it with a golbal maximum.
Since we are getting a mininum of each pair, we could sort out the array.
///////////////////////////////////////////
Time Complexity : O(NLogN), Total number of elements
Space Complexity : O(1)
///////////////////////////////////////////
*/
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int sum = 0;
        for ( int i =0; i < nums.size(); i+= 2){
            sum += nums[i];
        }
        return sum;
    }
};