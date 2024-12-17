# 2 Approaches:
# 1. Sort the array and then get min of consecutive numbers, then add to maximize: O(nlog(n))
# 2. Bucket Sort: O(range of numbers)
# class Solution:
#     def arrayPairSum(self, nums: List[int]) -> int:
#         nums.sort()
#         res = 0
#         for i in range(0,len(nums),2):
#             res += nums[i]

#         return res

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # Find the range of numbers
        min_val = min(nums)
        max_val = max(nums)
        take = True

        # Create buckets for the range [min_val, max_val]
        offset = -min_val  # Offset to handle negative indices
        buckets = [0] * (max_val - min_val + 1)
        res = 0
        carry = 0

        # Count occurrences of each number
        for num in nums:
            buckets[num + offset] += 1

        # Traverse the buckets to calculate the result
        for i in range(len(buckets)):
            while buckets[i] > 0:
                if take:
                    res += i - offset  # Convert bucket index back to the original number
                take = not take  # Toggle for pairing
                buckets[i] -= 1

        return res
