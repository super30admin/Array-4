# Leetcode - 561
# sort the elements and get the alternate pairs of numbers and add them this way we get the highest sum among the pairs
class Solution(object):
    def arrayPairSum(self, nums):
        # edge case
        if len(nums) == 0:
            return 0
        # Vraibles
        nums = sorted(nums)
        # return
        sum = 0
        # logic
        for i in range(len(nums)):
            if i % 2 == 0:  # since the lowest element in the pair has to be added
                sum += nums[i]
        """
        :type nums: List[int]
        :rtype: int
        """
        return sum



#python optimal
class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        #print(nums[::2])
        return sum(nums[::2])