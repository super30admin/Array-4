// Time Complexity: O(n)
// Space Complexity: O(1)
// Did the code run successfully on Leetcode? Yes

// Approach:
// 1. Initialize a variable i to the second last index of the array.
// 2. Find the first index i from the end where nums[i] < nums[i + 1].
// 3. If i is not -1, find the first index j from the end where nums[j] > nums[i].
// 4. Swap nums[i] and nums[j].
// 5. Reverse the subarray from index i + 1 to the end of the array.

class Solution {
    public:
        void nextPermutation(vector<int>& nums) {
            int n = nums.size();
            int i = n - 2; 
    
            while(i >= 0 && nums[i] >= nums[i + 1]){
                i--;
            }
            if(i >= 0){
                int j = n - 1;
                while(j >= 0 && nums[j] <= nums[i]){
                    j--;
                }
                swap(nums[i], nums[j]);
            }
            reverse(nums.begin() + i + 1, nums.end());
        }
    };