'''
Solution:
1.  To find sum of mins of each pair of 2, we need to sort the array so that the elements get closer to each other.
2.  Sum all first elements in the pair or numbers at even indices.

Time Complexity:    O(NlogN)    |   Space Complexity:   O(1)
** Assuming sort doesn't take any extra space
--- Passed all testcases on Leetcode successfully
'''

class ArrayPairSum:
    def arrayPairSum(self, nums: List[int]) -> int:

        #   edge case check
        if (nums == None or len(nums) == 0):
            return 0

        #   sort the array
        nums.sort()

        #   sum up the left indices of each pair
        total = 0
        for i in range(0, len(nums), 2):
            total += nums[i]

        #   return
        return total