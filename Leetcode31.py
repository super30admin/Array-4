# Time Complexity = O(n)
# Space Complexity = O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n - 2
    # Step 1: Find the first decreasing element from the right
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
    # Step 2: If such an element is found, find the next larger element on the right
        if i >= 0:
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]  # Swap

    # Step 3: Reverse the right portion to get the next permutation
        nums[i + 1:] = reversed(nums[i + 1:])
