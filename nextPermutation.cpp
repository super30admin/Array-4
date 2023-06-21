// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes 

// 3 step process 
// Find the breach or the number which reduces
// Swap it with the next greater number on the right 
// Reverse the numbers after the breach 
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        if(n == 0)
            return;
        int breach = -1;
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                breach = i;
                break;
            }
        }
        // Swap with the next bigger element
        if(breach >= 0) {
            for(int i = n-1; i >= 0; i--) {
                if(nums[i] > nums[breach]) {
                    swap(nums[i], nums[breach]);
                    break;
                }
            }
        }
        
        // Reverse the rest of the numbers
        reverse(nums, breach+1, n-1);
    }

private:
    void reverse(vector<int>& nums, int begin, int end){
        while(begin < end){
            swap(nums[begin++], nums[end--]);
        }
    }
};