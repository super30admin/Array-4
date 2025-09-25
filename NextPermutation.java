// This solution uses a three step approach to get to the next lexicographical array
// First step involves find the index where the number is decreasing as we wont be able to find next increasing number
// Second step involves swapping with the next immediate number in the left over array
// Third step involves reversing the remaining numbers
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1) return;

        int index = getAnomalyIndex(nums);

        if(index!=-1) {
            swap(nums, index);
        }
        reverse(nums, index+1, nums.length-1);
    }

    private int getAnomalyIndex(int[] nums) {
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i]<nums[i+1]) {
                return i;
            }
        }
        return -1;
    }

    private void swap(int[] nums, int index) {
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i]>nums[index]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                return;
            }
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

