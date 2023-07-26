class Solution(object):
    def nextPermutation(self, nums):
        """
        Time complexity - O(3n) == O(n)
        space complexity - O(1)
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0:
            return

        n = len(nums)
        i = n - 2

        # Step 1: Find the first element from the right that is smaller than its next element.
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        j = n - 1

        # Step 2: If such an element is found, find the smallest element to its right that is greater than it.
        if i >= 0:
            while nums[i] >= nums[j]:
                j -= 1

            # Step 3: Swap the two elements found in Steps 1 and 2.
            nums[i], nums[j] = nums[j], nums[i]

        # Step 4: Reverse the elements to the right of the position found in Step 1.
        self.reverse(nums, i + 1, n - 1)

    def reverse(self, nums, left, right):
        """
        Reverse the elements in the list from index 'left' to 'right' in-place.

        :type nums: List[int]
        :type left: int
        :type right: int
        """
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
