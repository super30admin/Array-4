// TC O(N) -- ITERATE OVER THE ARRAY ONLY ONCE
// SC O(1) -- NO EXTRA SPACE IS USED

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int rsum = 0;
        int maxi = INT_MIN;
        for (int x : nums) {
            rsum = max(rsum + x, x);
            maxi = max(maxi, rsum);
        }
        return maxi;
    }
};
