#TC: O(nlogn) SC:O(1)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums==None or len(nums)==0:
            return

        nums.sort()
        sum=0

        for i in nums[0::2]:
            print(i)
            sum = sum+i
        
        return sum
