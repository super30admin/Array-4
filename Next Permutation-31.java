// Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        
        int n = nums.length;
        int i = n-2;
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }

        int j = n-1;
        if(i >= 0){
            while(j >= 0 && nums[j]<= nums[i]){
                j--;
            }
            swap(nums, i,j);
        }
        reverse(nums, i + 1, n - 1);

    }

// Time Complexity: O(1)
//Space Complexity: O(1)
     private void swap(int[] nums,int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

// Time Complexity: O(1)
//Space Complexity: O(1)
    private void reverse(int[] nums, int l, int r){
        while(l <= r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
