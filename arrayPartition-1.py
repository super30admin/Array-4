'''
Time Complexity: O(nlogn)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: Sort the array to reduce the partition space and then find min of( the element and the next element)and
increase by 2 add this to count.
'''


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        count = 0
        for i in range(0, len(nums), 2):
            count += min(nums[i], nums[i + 1])

        return count