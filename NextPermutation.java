// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.Arrays;

class NextPermutation {
    public int[] nextPermutation(int[] nums) {
        if(nums==null) return nums;
        int n = nums.length;

        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums, i, j);
        }

        //reverse the digits from i+1 to n;
        reverse(nums, i+1, n-1);

        return nums;
    }

    private void reverse(int [] nums, int l, int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String [] args){
        NextPermutation np = new NextPermutation();
        System.out.println(Arrays.toString(np.nextPermutation(new int[]{3, 1, 2})));
    }
}