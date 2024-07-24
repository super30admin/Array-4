# Time Complexity : O(n)
# Space Complexity : O(1)
class Solution:
    def nextPermutation(self, nums):
        if not nums or len(nums) == 0:
            return
        n = len(nums)
        i = n - 2
        # From back to front, find the index of first number < number to its right.
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        # From back to front, find the first number > nums[i], swap it with
        # nums[i].
        if i >= 0:
            j = n - 1
            while j > i and nums[j] <= nums[i]:
                j -= 1
            self.swap(nums, i, j)
        # Reverse nums from i+1 index to the last number.
        self.reverse(nums, i + 1, n - 1)
    
    def reverse(self, nums, l, r):
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1
    
    def swap(self, nums, i, j):
        nums[i], nums[j] = nums[j], nums[i]

# Examples
solution = Solution()

# Example 1
nums1 = [1, 2, 3]
solution.nextPermutation(nums1)
print("Next permutation of [1, 2, 3] is:", nums1) # Output: [1, 3, 2]

# Example 2
nums2 = [3, 2, 1]
solution.nextPermutation(nums2)
print("Next permutation of [3, 2, 1] is:", nums2) # Output: [1, 2, 3]

# Example 3
nums3 = [1, 1, 5]
solution.nextPermutation(nums3)
print("Next permutation of [1, 1, 5] is:", nums3) # Output: [1, 5, 1]