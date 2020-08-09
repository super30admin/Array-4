class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        maxsum = 0
        for i in range(0, len(nums), 2):
            maxsum+=nums[i]
        return maxsum

#time complexity - O(nlogn + n) ~ O(nlogn)

#space complexity - O(1)

#all test cases passed