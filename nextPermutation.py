class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # T: O(n), S: O(1)
        n = len(nums)

        # Step 1: Find the first decreasing element from the right
        i = n - 2
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        if i >= 0:  # If a valid pivot is found
            # Step 2: Find the next larger element from the right
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]  # Swap

        # Step 3: Reverse the suffix
        nums[i + 1 :] = reversed(nums[i + 1 :])
