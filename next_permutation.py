"""
 Time Complexity O(n)
 Space Complexity: O(1)
"""


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def rotate(i, j):
            while i <= j:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
                j -= 1
        min_val = -1
        checker = -1
        # Step 1
        for i in range(len(nums)-1, -1, -1):
            if nums[i] < min_val:
                checker = i
                break
            else:
                min_val = nums[i]
        # Step 2
        last = len(nums) - 1
        if checker != -1:
            while nums[last] <= nums[checker]:
                last -= 1
            nums[last], nums[checker] = nums[checker], nums[last]
        # Step 3
        left = checker + 1
        right = len(nums) - 1
        rotate(left, right)
