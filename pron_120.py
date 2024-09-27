#leetcode 53
class Solution:
    def maxSubArray(self, nums):
        # variables
        sum = 0
        max_sum = -float('inf')
        # logic :for every element we keep adding it to to the curr element and if that sun is < than crr elemen then we replace sum with curr element
        for num in nums:
            sum += num

            if num > sum:
                sum = num
            max_sum = max(max_sum, sum)
        return max_sum