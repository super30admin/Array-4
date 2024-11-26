# Time Complexity: O(nlogn)
# Space Complexity: O(1)
class Solution:
    def arrayPairSum(self, nums) :
        n = len(nums)
        # sort the array and then we will move the pointer by 2 starting from 0th index and will take the alternate value sum
        nums.sort()
        maxSum = 0
        for i in range(0, n, 2):
            maxSum += nums[i]

        return maxSum
