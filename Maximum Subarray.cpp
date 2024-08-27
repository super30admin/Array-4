// follow up - find start & end index of ans
//time: O(n)
//space: O(1)
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int i = 0, j = 0, currSum = 0, maxSum = INT_MIN, start = 0, end = 0;
        while(j < nums.size()) {
            if(nums[j] > currSum && currSum < 0) {
                i = j;
                currSum = nums[j];
            }
            else currSum += nums[j];
            // maxSum = max(maxSum, currSum);
            if(currSum > maxSum) {
                maxSum = currSum;
                start = i;
                end = j;
            }
            j++;
        }
        cout<<start<<" "<<end;
        return maxSum;
    }
};