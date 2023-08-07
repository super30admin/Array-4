# Time Complexity : O(n)
#Space Complexity : O(n)
# #// Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No
 def maxSubArray(self, nums: List[int]) -> int:        
	newNum = maxTotal = nums[0]        
	
	for i in range(1, len(nums)):
		newNum = max(nums[i], nums[i] + newNum)
		maxTotal = max(newNum, maxTotal)

	return maxTotal	