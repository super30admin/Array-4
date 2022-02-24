// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int i=nums.length -2;

        //1. find the breach
        while(i>=0 && nums[i] >= nums[i+1]){   // T.C - O(N); S.C - O(N)
            i--;
        }

        //2. find the value to swap
        if(i>=0){
            int j=nums.length-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }

        //3. Reverse the values from i+1 to the last element
        reverse(nums, i+1, nums.length-1);

    }

    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

