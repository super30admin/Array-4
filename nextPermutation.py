"""
1. Start with n-1 element and find breach
Breach is when starting from last index, if prev adj ndex is greater than last
Continue traversing back and locate breach
2. Swap breach element with n-1th element
3. Reverse the array starting the point where breach was found
TC - O(n)
SC - O(1)
"""


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0: return
        n = len(nums)
        index = -1
        # step 1 - fnd breach or the element
        for i in range(n - 1, 0, -1):
            if nums[i] < nums[i + 1]:
                index = i
                break
        # step 2:
        # find the element from the right which i just greater than the element found from step 1
        if index != -1:
            for i in range(n - 1, 0, -1):
                if nums[i] > nums[index]:
                    swap(nums, i, index)
                    break

        # step 3: reverse the part from index+1 till end
        reverse(nums, index + 1, n - 1)

        def swap(nums, l, r):
            temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp

