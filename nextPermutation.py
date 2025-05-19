class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Approach:
        1. Find the first index `i` from the right where nums[i] < nums[i+1]. (This is the pivot)
        2. If such an index exists, find the smallest number greater than nums[i] to its right — call it index `j`.
        3. Swap nums[i] and nums[j].
        4. Reverse the suffix starting at i+1 to get the next lexicographically greater permutation.
        5. If no such index exists (the array is in descending order), just reverse the entire array.

        Time Complexity: O(n)
        Space Complexity: O(1)
        """
        n = len(nums)

        # Step 1: Find the pivot
        i = n - 2
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        # Step 2: Find the rightmost successor to the pivot
        if i >= 0:
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]

        # Step 3: Reverse the suffix
        self.reverse(nums, i + 1, n - 1)

    def reverse(self, nums, l, r):
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
