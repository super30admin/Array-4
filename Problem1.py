'''
Problem: Array Partition
Time Complexity: O(nlogn), n is length of nums
Space Complexity: O(1) 
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        Sort the array
        get the even index elements as those will be the minimum 
        add them and return as result
'''

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0

        for i in range(len(nums)):
            if i%2==0:
                result+=nums[i]

        return result

        