// Time Complexity: O(nlogn)
// Space Complexity: O(1)
// Did the code run successfully on Leetcode? Yes

// Approach: 
// 1. Sort the array in ascending order.
// 2. Initialize a variable sum to 0.
// 3. Iterate through the array with a step of 2, adding the minimum of each pair to sum.
// 4. Return the sum.
// 5. The minimum of each pair is the first element in the sorted array, so we can just add every second element starting from index 0.

class Solution {
    public:
        int arrayPairSum(vector<int>& nums) {
            sort(nums.begin(), nums.end());
            int sum = 0; 
            for(int i = 0; i < nums.size() - 1; i+=2){
                sum += min(nums[i], nums[i+1]);
            }
            return sum;
        }
    };