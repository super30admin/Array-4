// Time Complexity :O(n) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        
        int j = nums.size()-1;
        int i = j-1;
        //find breach
        while(i >= 0 && nums[i] >= nums[j]){
            i--;
            j--;
        }
        cout<<i<<endl;
        if(i>=0) {
            int k = nums.size()-1;
            while(nums[i] >= nums[k]) k--;
            swap(nums[i],nums[k]);
        }
        reverse(nums,i+1,nums.size()-1);
        return;
    }
    void reverse(vector<int>& nums, int l, int r){
        while(l < r){
            swap(nums[l],nums[r]);
            r--;
            l++;
        }
    }
};