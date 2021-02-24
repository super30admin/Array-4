class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //find the number to be craeting a breach
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        
        //find the number we need to swap with
        int j = n-1;
        if(i!=-1){
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        //reverse the array from the j+1 position
        j = i+1;
        i = n-1;
        while(j<n && i>j){
            swap(nums, j, i);
            j++; i--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

//Time complexity : O(N) where N is the length of array
//Space complexity : O(1)
