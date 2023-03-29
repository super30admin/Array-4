#All TC on leetcode passed

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        #Here we traverse the array and for every iteration we check if cur num is greater than cur num plus curSum, if yes then we start new cur sum with cur num else we add cur num to cur sum. For each iteration max res is updated.
        #Time complexity - O(n)
        #Space complexity - O(1)
        res = -math.inf
        curSum = 0

        #These pointers used to track the indices of the max sum subarray
        curStart = 0
        start = 0
        end = 0

        for i in range(len(nums)):
            if nums[i]+curSum<nums[i]:
                curSum = nums[i]
                curStart = i
            else:
                curSum += nums[i]

            if res<curSum:
                res = curSum
                start = curStart
                end = i
        
        print(start, end) #returns the start and end index of max sum subarray
             
        return res
        