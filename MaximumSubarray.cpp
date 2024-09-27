// Time Complexity - O(n)
// Space Complexity - O(1)
// Problems Faced - No!
// It runs on Leetcode!
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int rSum = nums[0];
        int currMax = nums[0];
        
        int n = nums.size();
        
        for(int i = 1; i < n; i++){
            rSum = max(nums[i], rSum + nums[i]);
            if(rSum >= currMax)
                currMax = rSum;
        }
        return currMax;
    }
};

// Follow-up Question
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int rSum = nums[0];
        int currMax = nums[0];
        int n = nums.size();
        int start = 0;
        int end = 0;
        int currStart = 0;
        
        for(int i = 1; i < n; i++){
            if(nums[i] > rSum + nums[i]){
                currStart = i;
                rSum = nums[i];
            }
            else
                rSum = rSum + nums[i];
            //rSum = max(rSum + nums[i], nums[i]);
            if(rSum > currMax){
                currMax = rSum;
                start = currStart;
                end = i;
            }
        }
        cout << "Start: " << start << endl;
        cout << "End: " << end << endl;
        return currMax;
    }
};

// Another approach
// Time Complexity - O(n)
// Space Complexity - O(1)
// Problems Faced - No!
// It runs on Leetcode!
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        if(n == 1) 
            return nums[0];
        int currSum = 0, maxSum = nums[0];
        for(int i=0; i<n; i++)
        {
            currSum = currSum + nums[i];
            if(currSum > maxSum)
                maxSum = currSum;
            if(currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }
};