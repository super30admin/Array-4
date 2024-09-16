"""
The approach here is to sort the array and starting from 0 iterate over the array skipping a index everytime
,now we add those values to sum variable intialized to 0 and the final value of sum is the answer.
Leetcode - running
Time complexity - O(N+N/2)
Space complexity - O(1)

"""
def arrayPairSum(self, nums):
    nums = sorted(nums)
    sum = 0
    for i in range(0,len(nums),2):
        sum += nums[i]
    return sum