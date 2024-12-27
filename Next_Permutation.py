# Explain your approach briefly at the top:
# 1. Traverse the array from the end to find the first decreasing element (pivot).
# 2. If a pivot is found, find the smallest number greater than the pivot from the right end and swap them.
# 3. Reverse the subarray to the right of the pivot to get the next lexicographically greater permutation.
# 4. If no pivot is found, reverse the entire array as it is the last permutation.

# Time Complexity: O(n), where n is the length of nums (one pass to find pivot, one pass to find swap, one pass to reverse).
# Space Complexity: O(1), as the operations are performed in-place.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No



class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Step 1: Find the pivot (first element from the end that is smaller than the next one)
        pivot = len(nums) - 2
        while pivot >= 0 and nums[pivot] >= nums[pivot + 1]:
            pivot -= 1
        
        if pivot >= 0:  # Step 2: If a pivot is found
            # Find the smallest element greater than nums[pivot] from the end
            for i in range(len(nums) - 1, pivot, -1):
                if nums[i] > nums[pivot]:
                    # Swap nums[pivot] with nums[i]
                    nums[pivot], nums[i] = nums[i], nums[pivot]
                    break
        
        # Step 3: Reverse the subarray to the right of the pivot
        left, right = pivot + 1, len(nums) - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
