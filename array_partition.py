#TC:O(n logn)
#SC:O(1)
class Solution:
    def arrayPairSum(self, nums):
        nums.sort()  # Sort the array in ascending order.
        total = 0
        for i in range(0, len(nums), 2):
            total += nums[i]  # Add the minimum value from each pair to the total.
        return total