// Time Complexity :O(n) 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    void reverse(vector<int>& nums, int i, int j) {
        while (i < j) {
            swap(nums[i], nums[j]);
            i++;
            j--;
        }
    }
    void nextPermutation(vector<int>& nums) {

        int n = nums.size();
        int i = n - 2;
        int j = n - 1;
        while (i >= 0 && nums[i] >= nums[j]) {
            i--;
            j--;
        }
        if (i >= 0) {
            j = n - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }

            swap(nums[i], nums[j]);
        }
        reverse(nums, i + 1, n - 1);
    }
};
