//TC - O(n)
//sc - O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int n = nums.length;
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){ //while the current number is greater than or equal to number to right , keep moving as the reverse of it will not help us. 
        i--;

        }
        if(i != -1){
            int j = n - 1;
            while(j >= 0 && nums[j] <= nums[i]){ // need to find the next greater element to nums[i]
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
        
    }
    private void reverse(int[] nums, int i, int j){
        while(i <= j){
            swap(nums,i,j);
            i++;
            j--;

        }
    }
    private void swap(int[] nums,int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}