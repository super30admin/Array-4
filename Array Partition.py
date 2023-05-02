class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # Time O(nlogn + n)
        # Space O(1)

        # Approach 1

        # nums.sort()
        # result = 0
        # for i in range(0, len(nums), 2):
        #     result += nums[i]

        # return result

        # Approach 2
        return sum(sorted(nums)[::2])