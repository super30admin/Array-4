// Time complexity - 0(n)
// space complexity - 0(1)
// Here in this solution,checking whether i is greater than i+1, if it is greater checking i is greater than 0 and then swapping i,j values.

class Solution {
    public void nextPermutation(int[] nums) {
      // if(nums = null || nums.length == 0) return;
        int i=nums.length-2;
        while(i>0 && nums[i] >= nums[i+1])
            i--;
        int j= nums.length-1;
            if(i>=0){
            while(nums[i] >= nums[j])
                j--;
                swap(nums,i,j);
            }
            reverse(nums,i+1,nums.length-1);
        }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
   private void reverse(int [] nums,int start,int end){
       while(start < end){
           swap(nums,start,end);
           start ++; end--;
           
       }
   }
}