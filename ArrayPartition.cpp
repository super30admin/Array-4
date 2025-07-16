// This solution uses sorting approach NlogN

TC - NLogN -- For sorting the array
SC - O(1) -- No additional space is used
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int res = 0;
        for(int i =0;i<nums.size(); i += 2){
            res += nums[i];
        }
        return res;
    }
};
