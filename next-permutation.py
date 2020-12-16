# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
    # Algorithm:
    # Find largest index i such that array[i − 1] < array[i].
    # (If no such i exists, then this is already the last permutation.)
    # Find largest index j such that j ≥ i and array[j] > array[i − 1].
    # Swap array[j] and array[i − 1].
    # Reverse the suffix starting at array[i].

        i = j = len(nums) - 1
        while i > 0 and nums[i] <= nums[i-1]:
            i -= 1

        if i == 0:  # descending sequence
            nums.reverse()
            return

        k = i - 1

        # Find the successor of k in the subarray [k:]
        while nums[j] <= nums[k] and j >= 0:
            j -= 1

        # Swap nums[j] and nums[k]
        nums[j], nums[k] = nums[k], nums[j]

        # Reverse subsequence [k+1:]
        l, r = k + 1, len(nums) - 1
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
