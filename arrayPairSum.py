#TC:O(nlogn)
#SC:O(1)
#Approach:Sort the numbers and add the alternate number, leaving the highest number in calculating the sum
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        
        print(nums[::2])
        return sum(nums[::2])
