// Time complexity: O(n)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void nextPermutation(int[] nums) {
        //find the breach
        int n=nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //swap and then reverse the elements from breach
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reversal(nums,i+1,n-1);
    }
    
    public void reversal(int[] nums, int l,int r){
        while(l<r){
            swap(nums,l,r);
            l++;r--;
        }
    }
    
    public void swap(int[] nums,int i,int j){
        int temp =nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
