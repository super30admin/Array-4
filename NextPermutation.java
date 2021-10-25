package Array4;
// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class NextPermutation {    public void nextPermutation(int[] nums) {
    //find number to be swapped
    int i=nums.length-2;
    while(i >= 0 && nums[i+1] <= nums[i]){
        i--;
    }
    if(i<0)
    {
        reverse(nums, 0, nums.length-1);
        return;
    }
    int j=nums.length-1;
    if(i>=0){
        while(j>0 && nums[j] <= nums[i]){
            j--;
        }
        swap(nums, i, j);
    }
    reverse(nums, i+1, nums.length-1);

}
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int [] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;j--;
        }
    }

}
