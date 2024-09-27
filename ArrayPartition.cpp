// Time Complexity - O(nlogn)
// Space Complexity - O(1)
// Problems Faced - No!
// It runs on Leetcode!
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        int answer = 0;
        int i = 0;
        while(i < n){
            answer += nums[i];
            i += 2;
        }
        return answer;
    }
};