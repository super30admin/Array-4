# Leetcode:Error
# no doubts
# time complexity: o(n)
# explaination: we have two variables curr max and maxsum and we keep on adding all the elements from the array to currsum and keep comparing it with maxsum. If currsum is greater than maxsum then maxsum becomes currsum. If the array[i] is greater than the maxsum and currseum, we reset the value if maxsum and currsum with array[i]


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        if len(nums) == 1:
            return nums[0]

        curr = nums[0]
        maxsum = nums[0]

        for i in range(1, len(nums)):
            curr += nums[i]
            if maxsum < curr:
                maxsum = curr

            if maxsum < nums[i] and curr < nums[i]:
                maxsum = nums[i]
                curr = nums[i]
            print("max{} and cur{}".format(maxsum, curr))

        return maxsum
