//Time complexity:O(n)
//Space complexity:O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        //step 1 - Go from end to first and find which numbe ris greater than the next(in order)
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        
        
        //Step-2 - see which number to swap it with by repeating step 1 but stopping when num is greater than where we stopped i
        int j=nums.length-1;
        if(i>=0){
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    
    
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}