//31. Next Permutation - https://leetcode.com/problems/next-permutation/description/

//Time Complexity: O(n!)
//Brute Force:
// Get all possible permutation combinations, sort them inorder and check for the next.


//Optimal:
//Time Complexity: O(3n) ~ O(n)
//Space Complexity: O(1)
class Solution{

    public void nextPermutation(int[] nums){
        int n = nums.length;
        //edge case
        if(nums == null || n == 0) return;

        //step1: find breach
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) { //no breach, thus i--
            i--;
        }
        //step2: found breach i, then find next higher j and swap
        if(i >= 0){
            int j = n - 1;
            //no breach - 24321 (2>1 -> j--| 2=2 -> j--)
            while(nums[i] >= nums[j]) j--;
            swap(nums,i,j);
        }
        //step3: reverse remaining from i+1, n-1
        reverse(nums, i+1, n - 1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}