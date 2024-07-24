# Time Complexity : O(nlogn)
# Space Complexity : O(1)
class Solution:
    def arrayPairSum(self, nums):
        if nums is None or len(nums) == 0:
            return 0
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result

# Examples
solution = Solution()

# Example 1
nums1 = [1, 4, 3, 2]
print("Example 1: arrayPairSum({}) = {}".format(nums1, solution.arrayPairSum(nums1))) # Output: 4

# Example 2
nums2 = [6, 2, 6, 5, 1, 2]
print("Example 2: arrayPairSum({}) = {}".format(nums2, solution.arrayPairSum(nums2))) # Output: 9

# Example 3
nums3 = [7, 3, 1, 0, 0, 6]
print("Example 3: arrayPairSum({}) = {}".format(nums3, solution.arrayPairSum(nums3))) # Output: 7