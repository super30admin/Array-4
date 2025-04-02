// Time Complexity: O(n)
// Space Complexity: O(1)
// Did the code run successfully on Leetcode? Yes

// Approach:
// 1. Initialize a variable maxSum to the first element of the array.
// 2. Initialize a variable currentPart to 0.
// 3. Iterate through the array, adding each element to currentPart.
// 4. If currentPart becomes negative, reset it to 0.
// 5. Update maxSum to be the maximum of maxSum and currentPart.

class Solution {
    public:
        int maxSubArray(vector<int>& nums) {
            int maxSum = nums[0];
            int currentPart = 0;
    
            for(int i = 0; i < nums.size(); i++){
                if(currentPart < 0){
                    currentPart = 0; 
                }
                currentPart += nums[i];
                maxSum = max(maxSum, currentPart);
            }
            return maxSum;
        }
    };