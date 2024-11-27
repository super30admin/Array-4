#Time Complexity: O(nlogn) + O(n)
#Space Complexity: O(1) 
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        n = len(nums)
        result = 0
        nums.sort()
        for i in range(0,n,2):
            result += nums[i]
        return result



        