# For this Problem, we approach by finding the first decreasing element from the end of the array. Then we find the first element greater than this element from the end of the array and swap them. Finally, we reverse the elements after the swapped element to get the next permutation.
# Time Complexity: O(n)
# Space Complexity: O(1)


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n - 2
        while i >= 0 and nums[i + 1] <= nums[i]:
            i -= 1
        if i >= 0:
            j = len(nums) - 1
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]
        
        def reverse(nums, start):
            i = start
            j = len(nums) - 1
            while i < j:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
                j -= 1

        reverse(nums, i + 1)
