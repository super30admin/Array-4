'''
31 Next Permutation
https://leetcode.com/problems/next-permutation/description/

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.

Given an array of integers nums, find the next permutation of nums.

The replacement must be in-place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]

Example 3:
Input: nums = [1,1,5]
Output: [1,5,1]

Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 100

Solution:
1. Brute Force
Generate all permutations, sort, locate the given permutation, return the next permutation
Time: O(N^N), Space: O(N^N)

2. Pivot, Swap, Reverse
Step 1: Pivot
Find the index of the pivot element (A[i] < A[i+1]).
The element whose index i is such that the digit at index is smaller than the digit to the right. Thus, going backwards (right to left), the pivot element is the first element that is smaller than its successor. In other words, going from right to left, we search for the first digit which breaks the ascending order pattern. Eg.  123654, '3' is the pivot element.
Exception: If the array is 54321, then there is no pivot element since the digits from right to left are arranged in ascending order. If no pivot element can be found, simply reverse the array,

Step 2: Supremum of Pivot to the right of pivot
Find the index of the digit which lies to the right of the pivot and
is the smallest digit greater than the pivot. We call this element SOP (supremum of pivot).
We swap SOP with the pivot element Swap(SOP, pivot). Note: Elements to the right of pivot are in increasing order from right to left. Hence, to find
the SOP, we scan the elements from right to left.
Eg. In 123654, 3 is the pivot. Scanning elements from end to pivot (4->5->6), we find that 4 is the SOP. Swapping SOP with pivot, we get 124653

Step 3: Reverse the digits from the right of pivot
124653 -> 124356
Thus, the next permutation of 123654 is 124356
https://youtu.be/-1cLK6PaLsQ?t=975
https://www.youtube.com/watch?v=uBTOIdBxb1o
Time: O(N), Space: O(1)
'''

from typing import List
def reverse(nums, left, right):
    while left <= right:
        nums[right], nums[left] = nums[left], nums[right]
        left += 1
        right -= 1

def nextPermutation(nums: List[int]) -> None:
    ''' Time: O(N), Space: O(1) '''
    if not nums:
        return None
    N = len(nums)
    # Step 1: Find the index of the pivot element (A[i] < A[i+1])
    pivot = -1
    for i in range(N-2,-1,-1):
        if nums[i] < nums[i+1]:
            pivot = i
            break

    # Step 2: Find the index of the SOP to the right of pivot and swap pivot
    # with SOP
    if pivot != -1:
        for i in range(N-1,pivot,-1):
            if nums[i] > nums[pivot]:
                nums[i], nums[pivot] = nums[pivot], nums[i]
                break

    # Step 3. Reverse all the elements starting from pivot+1 till the end of
    # array
    reverse(nums, pivot+1, N-1)
    return None

def run_nextPermutation():
    tests = [([3,4,7,5,6,2,4,1], [3,4,7,5,6,4,1,2]),
             ([4,7,5,4,3,2,1], [5,1,2,3,4,4,7]),
             ([5,4,3,2,1],[1,2,3,4,5]), # no pivot
             ([1,6,5,4,3,2,1],[2,1,1,3,4,5,6]),
             ([2,2,2,2], [2,2,2,2]), # no pivot
    ]
    for test in tests:
        nums, ans = test[0], test[1]
        print(f"\nnums = {nums}")
        nextPermutation(nums)
        print(f"next permutation = {nums}")
        success = (ans == nums)
        print(f"Pass: {success}")
        if not success:
            print("Failed")
            return

run_nextPermutation()
