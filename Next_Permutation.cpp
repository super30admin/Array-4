// Time Complexity : O(n) we are travelling through array once for checking peak_index, after that again to get the next peak value.  And for reversing the array also we will need only 0(n) running time.
// Space Complexity : O(1) we are not creating any space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no issues as of now.. Learning


class Solution {
public:
    void nextPermutation(vector<int>& nums) {
       
        int n = nums.size();
        
        // base case
        if(n== 0){
            return;
        }
        
        
        int peak_index = n-2;
        // find for the first peak value from right so that will give an indication for next permutation possible.
        while( peak_index >=0 && nums[peak_index]>=nums[peak_index+1]){
            
            peak_index -=1;
            
        }
        
        // only if we find a peak index we will do the swap with the highest value in its left.
        if( peak_index >=0){
            int peaknum = n-1;
            while(nums[peak_index]>= nums[peaknum]){ // checking for the next greatest element for the peak_index. to swap with.
                
                peaknum--;
            }
            swap(nums, peak_index, peaknum);
            
        }
        // if there is peak we will reverse the updated array
        // if not peak.. that means we havve the maximum permutation so reversing it will give shortest [3 2 1] => [ 1 2 3]
        reverse(nums, peak_index+1, n-1);
    }
    
    void swap( vector<int>& nums, int a, int b){
        
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        
    }
    
    void reverse(vector<int>& nums, int a, int b ){
        
        
        while(a<b){
            swap(nums, a,b);
            
            a++;
            b--;
            
        }
    }
    
};