 """
FAANMG Problem #123 {Medium } 

561. Array Partition


# Time Complexity = O(nlogn)
# Space Complexity = O(1)


Did this code successfully run on Leetcode : Yes



@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # sort the input list in ascending order
        nums.sort()
        # initialize the sum to 0
        res = 0
        # iterate through the list with step 2 to pick the minimum from each pair
        for i in range(0, len(nums), 2):
            res += nums[i]
        # return the sum
        return res