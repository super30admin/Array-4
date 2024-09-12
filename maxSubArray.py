"""
Approach 
1. set rSum to 1st element and maxVal to 1st element
2. At every step you've a choice to continue and add the next element or to discard the prev element(s) and start the subarray with the curr element
3. Depending on which option is chosen, update the value of max
4. Return the max val
TC - O(n)
SC - O(1)
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0: return 0

        n = len(nums)
        maxVal = nums[0]
        rSum = nums[0]

        for i in range(1, len(nums)):
            rSum = max(rSum + nums[i], nums[i])
            maxVal = max(maxVal, rSum)
        return maxVal

        # optimized shreya
        # currentSubArray = maxSubArray = nums[0]
        # for i in nums[1:]:
        #     currentSubArray = max(i, i+currentSubArray)
        #     maxSubArray = max(currentSubArray, maxSubArray)
        # return maxSubArray

        # Brute force approach
        # maxSubArray = -math.inf
        # for i in range(len(nums)):
        #     currentSubArray = 0
        #     for j in range(i, len(nums)):
        #         currentSubArray += nums[j]
        #         maxSubArray = max(currentSubArray, maxSubArray)
        # return maxSubArray
