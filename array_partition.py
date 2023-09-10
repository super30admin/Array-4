#TC:O(n logn)
#SC:O(1)
class Solution:
    def arrayPairSum(self, nums):
         # Sort the array in ascending order.
        nums.sort() 
        total = 0
        for i in range(0, len(nums), 2):
            # Add the minimum value from each pair to the total.
            total += nums[i]  
        return total