# brute force
# track every path 
# begin from every index in the nums array and track every sum.
# now find the maximum sum.
# time complexity - O(n^2)
# space complexity - O()
# did this code run on leetcode? - no (TLE)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)   # length of number array
        
        maxsum = float('-inf')
        for i in range(n):
            currsum = 0
            for j in range(i, n):
                currsum += nums[j]
                maxsum = max(maxsum, currsum)
        
        return maxsum


# dynamic programming approach
# at every index, keep the maximum number. Either the sum of numbers from the previous indices or the current number.
# time complexity - O(n)
# space complexity - O(1)
# did this code run on leetcode? - yes
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        prevsum = 0
        maxsum = float('-inf')
        for num in nums:
            prevsum = max(prevsum+num, num)
            maxsum = max(maxsum, prevsum)
        return maxsum
        
        
# dynamic programming approach
# tracking the indices which return the maximum sum.
# at every index, keep the maximum number. Either the sum of numbers from the previous indices or the current number.
# time complexity - O(n)
# space complexity - O(1) # pointers and variables to track the maximum sum.
# did this code run on leetcode? - yes
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        prevsum = 0
        maxsum = float('-inf')
        l, r = 0, 0
        
        for i, num in enumerate(nums):
            prevsum += num
            if  prevsum < num:
                prevsum = num
                l = i
            if maxsum < prevsum:
                maxsum = prevsum
                r = i
        
        return maxsum

        