# Time Complexity: O(nlogn)
# Space Complexity: O(1)
# Approach: Sorting and take sum of even index numbers
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0
        nums.sort()
        total = 0

        for i in range(0, len(nums), 2):
            total+=nums[i]

        # i=0
        # while i<len(nums):
        #     total+=nums[i]
        #     i+=2
        return total