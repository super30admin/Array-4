/**
 * Time Complexity:
 * O(N) where N is the number of
 * elements in the vector
 * 
 */

/**
 * Space Complexity:
 * O(1)
 * 
 */

/**
 * Approach:
 * First, we have to understand that next permutation here will
 * be just next greatest possible number with the given digits.
 * 
 * So, here if we observe that for current number, if we start
 * from the right to left, the numbers will increase because when
 * we go for next permutation we go for next greatest number.
 * 
 * For example: 45876
 * the next permutation will be 46578
 * 
 * So here if we observe when we moved from right to left,
 * 5 was smaller than 8, it means we have to change 5 with
 * a number which is just greater than it. That number is 6
 * in the given number. So, we swap them and our number becomes
 * 46875. Now, we observe that numbers after 5 are in descending 
 * order, so if we reverse them we will get our next permutation.
 * 
 */

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int i = nums.size() -2;
    
        while(i >= 0 && nums[i] >= nums[i+1] ) i--;
      
       
        if(i >= 0){
            int j = nums.size() -1;
            while( nums[j] <= nums[i]){
                j--;
            }
            swap(nums[i], nums[j]);
        }
        reverse(nums.begin() + i + 1, nums.end());
        
    }
};