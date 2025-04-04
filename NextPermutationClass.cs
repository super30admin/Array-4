// TC => O(n)
// SC => O(1)

public class Solution {
    public void NextPermutation(int[] nums) {
        if(nums == null || nums.Length == 0){
            return;
        }
        int n = nums.Length;
        int i =  n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i > -1){
            int j = n-1;
            while(j > i && nums[j] <= nums[i]){
                j--;
            }
            Swap(nums, i, j);
        }
        i++;
        Reverse(nums, i, n-1);
    }

    public void Swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void Reverse(int[] nums, int start, int end){
        while(start <= end){
            Swap(nums, start, end);
            start++;
            end--;
        }
    }
}