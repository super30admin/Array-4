# Approach: Sorting the pairs will result in pairs with minimum difference, to get result, add even indices as they are the larger numbers
# Time - O(N log N) # sorting numbers
# Space - O(1)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0
        
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result


