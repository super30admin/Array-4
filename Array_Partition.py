# Time: O(n log n)
# Space: O(n)

#Approach: 
"""
The intuition behind this problem is that if we want to maximize the sum which is contributed by the smaller number
in the pair, we need to minimise the gap between the numbers of the pair. To do so, nwe can sort the array and 
make adjascent elements to form pairs. 

"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0
        
        nums.sort()
        sum_val = 0
        for i in range(0, len(nums), 2):
            sum_val += nums[i]
        return sum_val
