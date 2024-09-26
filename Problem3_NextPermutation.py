# Time Complexity: O(n), where n is length of the input array
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        if not nums or len(nums) == 0:
            return

        n = len(nums)

        # Find the first decreasing element index
        t = -1
        for i in range(n - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                t = i
                break

        # Find the index containing value just greater than value at t and swap them
        if t != -1:
            for j in range(n - 1, t, -1):
                if nums[j] > nums[t]:
                    nums[j], nums[t] = nums[t], nums[j]
                    break

        self.reverse(nums, t + 1, n - 1)


    def reverse(self, nums, i, j):
        while i < j:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j -= 1






