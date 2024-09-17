# Arrays-4 problems

Problem 1:
(https://leetcode.com/problems/array-partition-i/)
// Time Complexity : O(nlogn) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Method #1: First, Sort the Array.  Secondly just add every second integer in the array
class Solution {
    public int arrayPairSum(int[] nums) {
        int maxSum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            maxSum+=nums[i];
        }
        return maxSum;
    }
}


Problem 2:
(https://leetcode.com/problems/maximum-subarray/)
// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Method #1: Find the maximum between the ith element and sum of current element and ith element.  Secondly check if 
// CurrSum is greater or MaxSum.  Return MaxSum. 
class Solution {
    public int maxSubArray(int[] nums) {
        int MaxSum=nums[0], currSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(currSum+nums[i], nums[i]);
            MaxSum=Math.max(currSum, MaxSum);
        }
        return MaxSum;
    }
}

Problem 2:
(https://leetcode.com/problems/next-permutation/)
// Time Complexity : O(n) // n+n+n
// Space Complexity : O(1) //
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Method #1: First, find the element which is breaching the order.  Second, Swap that element with the just larger element.
// Finally, reverse the array from breached element till end.
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j]) j--;
            swap(nums, i,j);
        }
        reverse(nums, i+1, n-1);
    
    }
    public void reverse(int nums[], int i, int j){
        while(i<=j){
            swap(nums, i, j);
            i++; j--;
        }
    }
    public void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
