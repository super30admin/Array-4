'''
T = O(n^2)
S = O(1)

Approach:
Brute force:Find all the possible sub array and compare its Sum,return the max sum
'''

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxx = float('-inf')
        Sum = 0
        for i in range(0,len(nums)):
            for j in range(i,len(nums)):
                Sum = 0
                for k in range(i,j+1):
                    Sum += nums[k]
                if Sum > maxx:
                    maxx = Sum
        return maxx
		
'''
T = O(n)
S = O(1)

Approach:
Compute a Running Sum from left to right reset the sum to the gratest element when
the previous sum is lesser than the current number
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxx = nums[0]
        rSum = nums[0]
        for i in range(1,len(nums)):
            rSum = max(rSum+nums[i],nums[i])
            maxx = max(rSum,maxx)
        return maxx

'''
T = O(n)
S = O(1)

Approach:
Just added pointers to capture the indecies of the sub array
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxx = nums[0]
        rSum = nums[0]
        StartPointer = 0
        start = 0
        end = len(nums)-1
        for i in range(1,len(nums)):
            rSum += nums[i]
            if rSum < nums[i]:
                rSum = nums[i]
                StartPointer = i
            if maxx < rSum:
                maxx = rSum
                start = StartPointer
                end = i
        print(start,end)
        return maxx
                        