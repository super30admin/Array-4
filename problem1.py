# Time Complexity o(nlogn)
# Space Complexity o(n)
# Since the smaller element matters and the larger element in the pair dosent matter. We should sort the array so that the second elemnt wastage is minimized
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:

        nums.sort()

        print(nums)
        result = 0
        for a in range(len(nums)):
            if a % 2 ==0:
                result += nums[a]
        return result
