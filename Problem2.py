"""
Implemented by first sorting the array in ascending order. Then, iterated through the list by skipping one element at a time (step = 2). At each step, added the smaller number of the pair to the result. This ensures the maximum possible sum of minimums of pairs.
Time Compelxity: O(nlogn)
Space Compelxity: O(1)
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:

        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result 