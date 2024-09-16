// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if(nums.size()==0){
            return;
        }
        
        int n = nums.size();
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
    
    void swap(vector<int>& nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    void reverse(vector<int>& nums, int l, int r){
        while(l <=r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
};
