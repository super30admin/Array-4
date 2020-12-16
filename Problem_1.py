"""
Time Complexity : O(nlogn) for sorting
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
The intuition behind this problem is that if we want to maximize the sum which is contributed by the smaller number
in the pair, we need to minimise the gap between the numbers of the pair. To do so, nwe can sort the array and 
make adjascent elements to form pairs. 
"""


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        total = 0
        for i in range(0, len(nums), 2):
            total += nums[i]
        return total
