//TC: O(n)
//SC: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;

        //find breach
        int n = nums.length;
        int i = n-2;

        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        //find jth to swap next greater val
        if(i != -1){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);

        }
        //reverse
        reverse(nums, i+1, n-1);

    }

    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private void reverse(int[] nums, int k, int l){
        while(k<l){
            swap(nums,k,l);
            k++;l--;
        }
    }
}
