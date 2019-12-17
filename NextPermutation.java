// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Nope.


// Your code here along with comments explaining your approach

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                index = i-1;
                break;
            }
        }
        if(index == -1){Arrays.sort(nums);return;}
        int i = index + 1;
        System.out.println(index);
        while(i < nums.length && nums[i] > nums[index]){
            i++;
        }
        int swapIndex = i - 1;
        int temp = nums[index];
        nums[index] = nums[swapIndex];
        nums[swapIndex] = temp;
        reverse(nums,index+1,nums.length-1);
    }
    public void reverse(int[] nums, int low, int high){
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;high--;
        }
    }
}