# class Solution:
#     def arrayPairSum(self, nums):
#         nums.sort()
#         result = 0
#         for i in range(0, len(nums), 2):
#             result += min(nums[i], nums[i + 1])
#         return result
    
import math


class Solution:
    def arrayPairSum(self, nums):
        freq = {}
        minimum, maximum = math.inf, -math.inf
        for num in nums:
            freq[num] = freq.get(num, 0) + 1
            minimum = min(minimum, num)
            maximum = max(maximum, num)

        result = 0
        skipNext = False

        for i in range(minimum, maximum + 1):
            if i not in freq:
                continue
            if skipNext:
                freq[i] -= 1

            frq = freq[i]
            if frq % 2 == 0:
                result += (frq // 2) * i
                skipNext = False
            else:
                result += (frq // 2) * i
                result += i
                skipNext = True

        return result
