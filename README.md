# Array-4

## Problem1 Array partition I (https://leetcode.com/problems/array-partition-i/)

//Time Complexity = O(NlogN)
//Space Complexity = O(1);

class Solution {
public int arrayPairSum(int[] nums) {
Arrays.sort(nums);
int sum = 0;
for(int i = 0; i < nums.length; i = i + 2) {
sum += nums[i];
}
return sum;
}
}

## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

//Time Complexity = O(N)
//Space Complexity = O(1);

class Solution {
public int maxSubArray(int[] nums) {
if(nums == null || nums.length == 0) {
return 0;
}
if(nums.length == 1) {
return nums[0];
}
int current = nums[0];
int max = nums[0];

        for(int i = 1; i < nums.length; i++) {

            current = Math.max(nums[i], current + nums[i]);

            if(current > max) {
                max = current;
            }

        }
        return max;
    }

}

## Problem3 Next permutation(https://leetcode.com/problems/next-permutation/)

//Time Complexity = O(N)
//Space Complexity = O(1);

class Solution {
public void nextPermutation(int[] nums) {
if(nums == null || nums.length == 0) {
return;
}
int i = nums.length-2;

        while(i >= 0&& nums[i] >= nums[i+1]) {
            i--;
        }
        if(i >= 0) {
            int j = nums.length-1;

            while(nums[i] >= nums[j]) {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);

    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            swap(nums,left,right);
            left++;
            right--;
        }
    }

}
