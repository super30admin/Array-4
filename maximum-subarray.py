# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxi=nums[0]
        cur_sum=0
        start,end=0,0
        for i in range(len(nums)):
            cur_sum+=nums[i]
            if cur_sum<nums[i]:
                start=i
                cur_sum=nums[i]  
            if cur_sum>maxi:
                maxi=cur_sum
                end=i
        return maxi