class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        //find the first number from end where number at that index is smaller than its right(index+1)
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        // we found i here
        //if found , we will find the immediate greater element to i
        if(i >= 0){
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums , i , j);
        }
        //reverse elements after i
        reverse(nums , i+1 , nums.length -1);

        
    }
    private void swap(int[] nums ,int a , int b){
        int temp = nums[a];
        nums[a]  = nums[b];
        nums[b]  = temp;
    }
    private void reverse(int[] nums , int start , int end){
        while(start < end){
            swap(nums , start++ , end--);
        }
    }
}