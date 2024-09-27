//o(n) time and o(1) space
//passed all leetcode cases
//used decresing and increasing order technique
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int n = nums.length;
        int i=n-2;
        while(nums[i]>=nums[i+1]){
            i--;
            if(i==-1) break;
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);

    }
    private void reverse(int[]nums, int start, int end){
        int i=start, j=end;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    private void swap(int[]nums, int start, int end){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end] = temp;
    }
}