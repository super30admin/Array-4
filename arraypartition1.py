# brute force methid
# leetcode:accepted
# time complexity: o(n)
# explination: sorted the elements and took the pairs.
# and added the min of every pair


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # pairs=len(nums)//2
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += min(nums[i], nums[i + 1])
        return result



