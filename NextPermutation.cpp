// Time Complexity - O(n)
// Space Complexity - O(1)
// Problems Faced - No!
// It runs on Leetcode!

class Solution {
    private:
    void reverse(vector<int>& arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }    
    }
    
    void swap(vector<int>& arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        int ptr = n-2;
        while(ptr >= 0 && nums[ptr] >= nums[ptr+1])
            ptr--;
        
        if(ptr >= 0){
            int j = n-1;
            while(nums[ptr] >= nums[j])
                j--;
            swap(nums, ptr, j);
        }
        reverse(nums, ptr+1, n-1);
    }
};