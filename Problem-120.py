'''
Leet code - 53 - Maximum subarray - https://leetcode.com/problems/maximum-subarray/
time complexity - O(N)
space complexity - O(1)

'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_sum=nums[0]
        max_sum=0
        for i in range(1,len(nums)-1):
            curr_sum=max(nums[i],curr_sum+nums[i])
            max_sum=max(curr_sum,max_sum)
        return max_sum
            
        
        