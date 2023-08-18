/*
Time complexity: O(n)
Space complexity: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size(), index = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        for(int i=n-1; i>=index && index != -1; i--){
            if(nums[i] > nums[index]){
                swap(nums[i], nums[index]);
                break;
            }
        }
        reverse(nums.begin() + index + 1, nums.end());
    }
};