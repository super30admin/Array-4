# Take the running sum
# Time complexity o(n)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:


        max_ = nums[0]

        sum_ = 0

        for i in range(len(nums)):

            sum_ += nums[i]

            if sum_ > max_:

                max_ = sum_


            if sum_ < 0:

                sum_ = 0

        return max_
