## Problem1 Array partition (https://leetcode.com/problems/array-partition/)

// Time Complexity - 0(n logn)
// Space Complexity - 0(1)


class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }
        return sum;       
    }
}



## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

// Time Complexity - 0(n)
// Space Complexity - 0(1)


class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int rSum = nums[0];
        int start = 0;
        int end = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < rSum + nums[i]) {
                rSum = rSum + nums[i];
            }
            else {
                rSum = nums[i];
                start = end - 1;
            }
            if (max < rSum) {
                max = rSum;
                end = i;
            }
        }
        return max;
    }
}


## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

// Time complexity - 0(n)
// Space complexity - 0(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int first = -1;
        for (int i = n - 2; i >= 0; i--) {
            if(nums[i + 1] > nums[i]) {
                first = i;
                break;
            }
        }
        if (first != -1) {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[first]) {
                    swap(nums, i, first);
                    break;
                }
            }
        }
        reverse(nums, first + 1);
    }
    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    private void reverse(int[] nums, int l) {
        int r = nums.length - 1;
        while (l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}