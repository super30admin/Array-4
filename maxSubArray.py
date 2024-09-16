#TC:O(n)
#SC:O(1)
#Ran successfully on Leetcode:Yes
#Approach:The idea is to create a dp array, that holds the first element of the array initially.Then the dp array is updated in such a way that if the previous element in the dp array is positive, then it is added to the current element from the nums array. Else 0 is added to the current element from the nums array and that is assigned to the current index of the dp array.
#Here instead of a p array I have used two variabes to keep a track of max values and curr values.


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        if not nums:
            return 0

        curSum = maxSum = nums[0]
        for num in nums[1:]:
            curSum = max(num, curSum + num)
            maxSum = max(maxSum, curSum)

        return maxSum
                 
