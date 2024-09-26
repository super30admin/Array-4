// Next Permutation #LC 31  #S30 124


class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return;
        }
        
        int n = nums.length;
        
        int i = n - 2;
        
        while( i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        
        if(i >=0 ) {
            int j = n - 1;
            while(j >= 0 && nums[j] <= nums[i] ) {
                j--;
            }
            
            swap( nums, i ,j);
        }
        
        reverse(nums, i+1, n-1);
    }
    
    private void swap ( int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        }   
    
    private void reverse( int[] nums, int l, int r) {
        while(l <=r ) {
            swap(nums, l, r);
            l++;
            r--;
        }   
    }
}


/*
Time complexity : 
O(n). In worst case, only two scans of the whole array are needed.

Space complexity : 
O(1). No extra space is used. In place replacements are done.

*/