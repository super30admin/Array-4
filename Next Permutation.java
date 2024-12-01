//brute force generate all permutations and sort, tc O(n!)

public class Solution {
    public void NextPermutation(int[] nums) {
        int i = nums.Length - 2;

        while(i >= 0 && nums[i] >= nums[i+1]){//O(n)//find breach
            i--;
        }
        if(i>=0){
            int j = nums.Length - 1;
            while(j >= 0 && nums[j] <= nums[i]){//O(n) find the next greater
                j--;
            }
            swap(nums, i, j);

        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start){//O(n)
        int end = nums.Length - 1;
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}


