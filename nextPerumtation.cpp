// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. From right, find first abberation where an element is lesser than to its right neighbor. Let it be called index
// 2. Find element just bigger than index to right of index and swap it (if two elements are equally bigger, choose rightmost)
// 3. Reverse list to the right of index    

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if(!nums.size())
            return;
        int n = nums.size();
        // step 1 - find first decreasing element from end
        int index=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                index=i-1;
                break;
            }
        }
        
        // if array is non-descending then do step 2 else direct step 3
        // step 2 - find next biggest element  
        int next=0, diff=INT_MAX;
        if(index!=-1){
            for(int i=index+1;i<n;i++){
                if(nums[i]>nums[index] && nums[i]-nums[index]<=diff){
                    next=i;
                    diff = nums[i]-nums[index];
                }   
            }
            swap(nums[index], nums[next]);
        }
        

        // step 3 - reverse all elements after index
        reverse(nums, index+1, n-1);
    }
    
    void swap(int& a, int& b){
        int temp = a;
        a = b;
        b = temp;
    } 
    
    void reverse(vector<int>& nums, int start, int end){
        while(start<end){
            swap(nums[start], nums[end]);
            start++;
            end--;
        }
    }
};