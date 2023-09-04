//time:(O(n))
//space: O(1))

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int finalSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < n; i++) {
            if (sum + nums[i] < nums[i]) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            finalSum = max(sum, finalSum);
        }

        return finalSum;
        
    }
};