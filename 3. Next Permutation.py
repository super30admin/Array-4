class Solution:
    # Time Complexity - O(n)
    # Space Complexity - O(1)
    def nextPermutation(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0: return None
        n = len(nums)
        first = -1
        # Locate a breach where i < i+1 while traversing from right
        for i in range(n - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                first = i
                break

        # look for an element just larger than the element at index first
        if first != -1:
            for i in range(n - 1, -1, -1):
                if nums[i] > nums[first]:
                    nums[i], nums[first] = nums[first], nums[i]
                    break

        # Reverse the part from (first+1) to (n-1)
        self.reverse(nums, first + 1, n - 1)

    def reverse(self, nums, l, r):
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1