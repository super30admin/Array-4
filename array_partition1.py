"""
// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
Algorithm Explanation
Since we want to maximize the minimum of pair of elements, we need to bring
them in order and then just keep the minimum from each pair linearly till the end
- Sort the array
- Sum the numbers at the even position(taking min of the pair)
- return sum
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        N = len(nums)
        k = N // 2
        results = []
        i = 0
        ans = sum([t if not i % 2 else 0 for i,t in enumerate(nums)])
        return ans