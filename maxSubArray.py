'''
Time Complexity --> O(n)
Sapce Complexity --> O(n)
running um values can be stred in a list and compare the max value at eah step
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_val = nums[0]
        ls = []
        ls.append(nums[0])
        for i in range(1, len(nums)):
            val = nums[i]+ls[-1]
            ls.append(max(nums[i], val))
            max_val = max(max_val, ls[-1])
        return max_val


            

