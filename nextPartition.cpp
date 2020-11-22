/*
Time : O(N)
Space : O(1)
Leetcode : Yes
*/
// Explanation : If it's in decresing order, return the reversed order
// Find last index k which is less than it's neighbor
// Find last index l after k which is greater than nums[k]
// Swap, k and l and reverse nums[k+1:]
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
    	int n = nums.size(), k, l;
    	for (k = n - 2; k >= 0; k--) {
            if (nums[k] < nums[k + 1]) {
                break;
            }
        }
    	if (k < 0) {
    	    reverse(nums.begin(), nums.end());
    	} else {
    	    for (l = n - 1; l > k; l--) {
                if (nums[l] > nums[k]) {
                    break;
                }
            } 
    	    swap(nums[k], nums[l]);
    	    reverse(nums.begin() + k + 1, nums.end());
        }
    }
}; 