// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
       
        while(i>=0 && nums[i]>=nums[i+1]){
                i--;
            
            //we now found breach

        }
        if(i>=0){
            int j = nums.length - 1;
            while(nums[j]<=nums[i]){
                j--;
            }
            //we found j
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);

        
    }
    private void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}