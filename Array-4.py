# Array-4

## Problem1 Array partition (https://leetcode.com/problems/array-partition/)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        sorted_nums = sorted(nums)
        min_pairs_sum = sum(sorted_nums[::2])
        return min_pairs_sum
# TC = O(n log n), SC = O(1)

## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum = current_sum = nums[0]
        for num in nums[1:]:
            current_sum = max(current_sum + num, num)
            max_sum = max(max_sum, current_sum)
        return max_sum
# TC = O(n), SC = O(1)

## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        pivot = -1
        for i in range(length - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                pivot = i
                break
        if pivot != -1:
            for j in range(length - 1, pivot, -1):
                if nums[j] > nums[pivot]:
                    nums[pivot], nums[j] = nums[j], nums[pivot]
                    break
        nums[pivot + 1:] = reversed(nums[pivot + 1:])
# TC = O(n), SC = O(1)
