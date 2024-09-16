# Time complexity:O(n)
# Space complexity: 0(n)
# Did code run successfully on leetcode: yes
# Any problem you faced: No


class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n<=1) return;

        int i = n - 2;

        while(nums[i] >= nums[i+1]){
            i--;
            if(i == -1) break;
        }

        if(i >= 0){

            int j = n-1;
            while(nums[j] <= nums[i]){

                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);


    }


    private void reverse(int[] nums, int start, int end){
        int i = start;
        int j = end;

        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }


    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}