# Array-4

## Problem1 Array partition I (https://leetcode.com/problems/array-partition-i/)

Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:

Input: [1,4,3,2]

Output: 4

Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

Note:

n is a positive integer, which is in the range of [1, 10000].

All the integers in the array will be in the range of [-10000, 10000].
<br> Space Complexity:O(1)
 <br>    Time Complexity: O(nlogn)+O(n/2): O(nlogn) 
<br> Approach- Sort the array and find the alternate numbers from 0,2,4,..... and take its sum.
## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],

Output: 6

Explanation: [4,-1,2,1] has the largest sum = 6.
<br> Space Complexity:O(1)
<br> Time Complexity:O(n)
<br> Approach: traverse the array and store the max sum so-far to comapre with the new max value.

## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
<br> not able to solve this problem

1,2,3 → 1,3,2

3,2,1 → 1,2,3

1,1,5 → 1,5,1
