/*
31. Next Permutation
Ran on leetcode: Yes
TC: O(n)
SC: O(1)
Find the breach from back, breach is element smaller than its following element. Again search from back first element which is greater than breach, swap them and reverse the elements after breach. If there is no breach it is largest element simply reverse the array
*/
class Solution {
    public void nextPermutation(int[] nums) {
        int numsLen = nums.length;
        int breach = -1;
        for(int i = numsLen - 1; i >= 1; i--){ // find the breach, first element which is smaller than the element after it
            if(nums[i - 1] < nums[i]){
                breach = i - 1;
                break;
            }
        }

        if(breach == -1){ // element is already largest, reverse it to smallest
            reverse(nums, 0, numsLen - 1);
        } else {
            for(int i = numsLen - 1; i >= 1; i--){ // swapp element which is just greater than breach
                if(nums[i] > nums[breach]){
                    swap(nums, i, breach);
                    break;
                }
            }
            reverse(nums, breach + 1, numsLen - 1); // reverse element after breach
        }
    }

    private void reverse(int[] nums, int i, int j){ // reverse array
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j){ // swap element i and j
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}