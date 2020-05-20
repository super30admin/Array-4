"""
## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2

3,2,1 → 1,2,3

1,1,5 → 1,5,1

time - O(N)
SPACE - CONSTANT
"""
# 1. find number to replace
# 2. find number that will replace
# 3. swap
# 4,. reverse

def nextPerm(nums):
    size = len(nums)
    if nums== None or len(nums) ==0:
        return 0
    i = size-2
    while i >=0 and nums[i]>= nums[i+1]:
        i -=1

    j = size-1

    if i >=0:
        while nums[j] <= nums[i]:
            j -=1
        nums[i], nums[j] = nums[j], nums[i]

    reversed(nums,i+1,size-1)

def reversed(nums, start, end):
    while start< end:
        nums[start], nums[end]= nums[end], nums[start]
        start +=1
        end -=1



