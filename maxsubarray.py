"""
max sum subarray
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currsum = 0
        maxsum = -float('inf')
        for i in range(len(nums)):
            currsum = max(currsum + nums[i], nums[i])
            maxsum = max(maxsum, currsum)
        return maxsum

        # maxendinghere=0
        # maxsofar=-float('inf')
        # for i in range(len(nums)):
        #     maxendinghere+=nums[i]
        #     if maxendinghere<nums[i]:
        #         maxendinghere=nums[i]
        #     if maxsofar<maxendinghere:
        #         maxsofar=maxendinghere
        # # if len()
        # # if len(nums)>14000:
        # #     return 2
        # return maxsofar

    ####O(n) solution below
    # maxsumtillnow = arr[0]
    # maxsum = arr[0]
    # for i in range(1, n):
    #     maxsumtillnow = max(maxsumtillnow + arr[i], arr[i])
    #     maxsum = max(maxsumtillnow, maxsum)

    ###brute force below
    # if len(nums) == 1:
    #     return nums[0]
    # maximumsum = -float('inf')
    # for i in range(len(nums)):
    #     sumtillnow = 0
    #     for j in range(i, len(nums)):
    #         sumtillnow += nums[j]
    #         if sumtillnow > maximumsum:
    #             maximumsum = sumtillnow
    # return maximumsum


