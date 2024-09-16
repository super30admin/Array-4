class Solution {
    public void nextPermutation(int[] nums) {
        //validate
        if(nums==null || nums.length==0) return;
        
        int i=nums.length-2;
        //logic
        while(i>=0 && nums[i+1]<=nums[i]){ //!Important
            i--;
        }
        if(i>=0) {
            int j=nums.length-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1); //!Important
    }
    
    private void reverse(int[] nums, int i){
        int start=i, end=nums.length-1;
        while(start<end){
            swap(nums, start, end);
            end--;
            start++;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
