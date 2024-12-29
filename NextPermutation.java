// Time complexity = O(n)
// start from the end and get the index whose value is less than the current index.
// for eg -> 9,1,3,5,8,6,3,2,1
// so here we get 5 which is less than 8
// then find the value which is greater than 5 from the end of the array.
// we get 6, which is greater than 5
// then swap 6 and 5.
// so we get 9,1,3,6,8,5,3,2,1
// then reverse the digits right after the swapped index.
// eg- 9,1,3,6,1,2,3,5,8
// this is the next permutation.
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i!=-1) {
            int j = nums.length-1;
             while(nums[j]<= nums[i]) {
                j--;
             }
             swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }

    private void reverse(int[] nums, int l, int r) {
        while(l<r) {
            swap(nums,l ,r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}