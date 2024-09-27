// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class NextPermutation {
    public void nextPermutation(int[] nums) {
        //find breach
        int i=nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        //breach is found if i is valid
        if(i>=0){
            //replace breached element with just largest element
            //will always be there as we found breach
            int j = nums.length-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            //swap nums[i] & nums[j]
            swap(nums, i, j);
        }
        //reverse descending subarray
        reverse(nums, i+1);
    }

    //reverse function
    private void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    //swap function
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}