# Array-4

## Problem1 Array partition (https://leetcode.com/problems/array-partition/)

Explain Solution in 3 lines: The simplest solution here is we want to use best possible elements for that we can just sort the array and take the elements at even indices and add it in the result and return the result. After sorting the array if we consider first two elements then the smallest between those two will be at index 0 similarly if we consider next two elements smallest will be at index 2. This is why we considered just even indices.

Time Complexity: O(nlogn + n) where n is number of elements in the array. nlogn time complexity to sort the array.

Space Complexity: O(1) as we are not using any extra space in this algorithm.

Approached Code: 

class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int result = 0;

        for(int i = 0; i < nums.length; i = i + 2) {
            result = result + nums[i];
        }

        return result;
        
    }
}



## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

Explain Solution in 3 lines: Simple logic in this solution is we are calculating running sum and checking if the current element alone is greater than the running sum or not. If the current element alone is greater than the running sum then we are assigning current element as running sum and then updating max variable if the previous max is maximum or current running sum is maximum. At the end we are returning max. For start and end indices - Whenever we are using current number instead of rSum we are resetting current start to current index. Then whenever we are updating the max we are assigning the current start to start and current i to end.

Time Complexity: O(n) where n is number of elements in num as we are iterating through array once.

Space Complexity: O(1) as we are not using any extra space in the algorithm.

Approached Code: 

class Solution {
    public int maxSubArray(int[] nums) {
        
        int rSum = nums[0];
        int max = nums[0];
        int n = nums.length;

        int start = 1;
        int end = 1;
        int currSt = 1;

        for(int i = 1; i < n; i++) {
            // rSum = Math.max(rSum + nums[i], nums[i]);
            // max = Math.max(rSum, max);

            rSum = rSum + nums[i];

            if(nums[i] > rSum) {
                rSum = nums[i];
                currSt = i;
            }

            if(rSum > max) {
                max = rSum;
                start = currSt;
                end = i;
            }
        }

        System.out.println(start);
        System.out.println(end);

        return max;
    }
}



## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

Explain Solution in 3 lines: In this approach we are doing 3 steps method. First we will go on from last element till the increasing order pattern break. So, i-1 element will be smaller than ith element. Once, we found out this element then we will find out the element just greater than that from the last part of the array. Then once we find that element we will swap these two elements. At the end we will just reverse the tail of this array which will be the position after the swapped element till the end of the array. In this way we got our next permutation.

Time Complexity: O(n) where n is number of elements in the array.

Space Complexity: O(1) as we are not using any extra space in this algorithm.

Approached Code: 

class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums == null) return;

        int n = nums.length;
        int i = n-2;

        while(i >= 0 && nums[i+1] <= nums[i]) {
            i--;
        }

        if(i >= 0) {
            int j = n-1;

            while(nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);

    }

    private void reverse(int[] arr, int l, int r) {
        while(l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}


