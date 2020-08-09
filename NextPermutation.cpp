// Time Complexity : O(N) where N=Number of anagrams each having length K
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Solved in 4 steps
//1. Find the descending element from end of array.
//2. Find the element just greater than descending element
//3. Swap the two elements
//4. Reverse the elements to make it in ascending order.

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        
        if(nums.size()==0)
            return;
        int i= nums.size()-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        int j=nums.size()-1;
        if(i>=0){
            while(j>=0 && nums[j]<=nums[i]){ 
            j--;
        }
        swap(nums[i],nums[j]);
        }
        
        reverse(nums,i+1,nums.size()-1);
        
    }
    
    void reverse(vector<int>& nums, int start,int end){
        while(start<end){
            swap(nums[start],nums[end]);
            start++;
            end--;
        }
    }
    
    void swap(int &a,int &b){
            int temp = a;
            a = b;
            b = temp;
    }
};
