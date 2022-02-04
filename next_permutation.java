class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return; //if there are no elements in the nums array or the length of the array is 0 then simply return
        int n = nums.length; //n stores the length of the nums array
        int first = -1; //first stores the index where the breach happens, initialized to -1
        for (int i = n - 2; i >= 0; i--) { //we move from right to left starting from i - 2 index
            if (nums[i] < nums[i + 1]) { //if the number at i is less than than number at i - 1, breach is happening
                first = i; // and we store the index of i in first
                break; //we break
            }
        }
        if (first != -1) { //if first is not equal to -1
            for (int i = n - 1; i > first; i--) { //we move from right to left
                if (nums[i] > nums[first]) { //if the number at i is greater than number at first
                    swap(nums, i, first); //swap the respective
                    break; //then we break
                }
            }
        }
        reverse(nums, first + 1, n - 1);// we now reverse the array from the next index of which we have stored the index where the breach is happening
    }
    private void swap(int[] nums, int l, int r) { //method for swapping two elements
        int temp = nums[l]; //temp stores the value at l in nums array
        nums[l] = nums[r]; //l stores the value at r in the nums array
        nums[r] = temp; //r stores the value that temp has stored. this is how swap happens
    }
    private void reverse(int[] nums, int l, int r) { //method for reversing array
        while(l < r) { //if l is less than r
            swap(nums, l, r); //we swap those two elements l and r
            l++; //we increment l
            r--; //we decrement r until the whole array is reversed.
        }
    }
}
//tc and sc - O(n) and O(1)