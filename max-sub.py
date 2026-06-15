# time O(n)
# space O(1)
class Solution:
	def maxSubArray(self,nums: List[int])->int:
		maxSum = float('-inf')
		curSum=0
		for r in range(len(nums)):
			curSum += nums[r]
			maxSum = max(curSum,maxSum)
			# discard negatives. Even if you have an array of all negatives the next negative will be set at curSum[r] anyway
			# negatives drag down the next number. If we see a negative, reset to 0. Prepare to start a new subarray at the next number
			if curSum < 0:
				curSum=0
				# include l just to visualize window
				l = r+1

		return maxSum


# [-2,1,-3,4,-1,2,1,-5,4]
#.   l. r