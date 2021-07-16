/*Running Time Complexity: O(n)
Space Complexity: Constant
Successfully Run and compiled on leetcode
*/
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        if(nums==null || nums.length==0) return;
        //Breach 
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //swap
        if(i>=0){
            int j = n-1;
            while(nums[i]>=nums[j]){
                j--;
            }    
            swap(nums,i,j);
        }
        
        //Reverse
        reverse(nums,i+1,n-1);
    
        
    }
    private void reverse(int[] nums, int l, int r){
        int temp;
        while(l<r){
            swap(nums,l,r);
            l++; r--;
        }
        
    }
    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r]  = temp;
    }
}