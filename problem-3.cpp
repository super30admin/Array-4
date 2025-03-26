// https://leetcode.com/problems/next-permutation/

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public:
        void reverse(vector<int>& nums, int i, int j){
            while(i<=j){
                swap(nums[i],nums[j]);
                i++;
                j--;
            }
        }
        void nextPermutation(vector<int>& nums) {
            int n = nums.size();
            int k = n-2;
            while(k>=0 && nums[k] >= nums[k+1]){
                k--;
            }
            if(k == -1){
                reverse(nums, 0, n-1);
            }
            else{
                int l = n-1;
                while(nums[k] >= nums[l]){
                    l--;
                }
                swap(nums[k], nums[l]);
                reverse(nums, k+1, n-1);
            }
    
        }
    };