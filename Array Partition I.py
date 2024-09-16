class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        #Time: O(N logN)
        #Space: O(1)
        nums.sort()
        sol=0
        for i in range(len(nums)):
            if i%2==0:
                sol+=nums[i]
        return sol