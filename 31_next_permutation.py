"""

## Problem 31: Next Permutation

## Author: Neha Doiphode
## Date:   10-31-2022

## Description
    A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
    For example, for arr = [1,2,3], the following are all the permutations of arr:
    [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

    The next permutation of an array of integers is the next lexicographically greater permutation of its integer.
    More formally, if all the permutations of the array are sorted in one container according to their lexicographical order,
    then the next permutation of that array is the permutation that follows it in the sorted container.
    If such arrangement is not possible, the array must be rearranged as the lowest possible order
    (i.e., sorted in ascending order).

    For example, the next permutation of arr = [1,2,3] is [1,3,2].
    Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
    While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.

    Given an array of integers nums, find the next permutation of nums.
    The replacement must be in place and use only constant extra memory.

## Examples:
    Example 1:
        Input: nums = [1,2,3]
        Output: [1,3,2]
        Explaination: All permutations: [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]
                      The above sequence of permutations is in lexicographical order since,
                      [1, 2, 3] < [1, 3, 2] < [2, 1, 3] < [2, 3, 1] < [3, 1, 2] < [3, 2, 1].

    Example 2:
        Input: nums = [3,2,1]
        Output: [1,2,3]

    Example 3:
        Input: nums = [1,1,5]
        Output: [1,5,1]

## Constraints:
    1 <= nums.length <= 100
    0 <= nums[i] <= 100

## Time complexity : O(n), In worst case, only two scans of the whole array are needed.

## Space complexity : O(1), No extra space is used. In place replacements are done.

"""

from typing import List, Optional

def get_input():
    print("Enter the inetger array(with spaces): ", end = "")
    inp_list = input()
    inp_list = [int(value) for value in inp_list.split()]
    return inp_list

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        # Step 1: Find the bridge
        # bridge is where the current number is lesser than the number on the right
        # Start the check from right to left
        # we find bridge as the index from where the right number is bigger
        idx = -1
        for ptr in range(n - 2, -1, -1):
            if nums[ptr] < nums[ptr + 1]:
                idx = ptr
                break

        # Step 2: We need to swap number at idx with next immediate bigger number on the right
        # If we don't find the bridge that means we all the numbers in descending order
        # in that case we don't need to perform the step 2.
        # So we first check if idx is not equal to -1
        if idx != -1:
            for ptr in range(n - 1, -1, -1):
                if nums[ptr] > nums[idx]:
                    nums[ptr], nums[idx] = nums[idx], nums[ptr]
                    break

        # Step 3: Reverse the elements from idx + 1 to n - 1 as we want the next permutation in
        # lexicographical order
        ptr1 = idx + 1
        ptr2 = n - 1
        while ptr1 <= ptr2:
            nums[ptr1], nums[ptr2] = nums[ptr2], nums[ptr1]
            ptr1 += 1
            ptr2 -= 1


# Driver code
solution = Solution()
inp_array = get_input()
print(f"Input array: {inp_array}")
solution.nextPermutation(inp_array)
print(f"Output: After array scan: Next permutation in lexicographical order: {inp_array}")
