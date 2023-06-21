#All TC on leetcode passed


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:

        #Here we sort the nums so that adjacent nums have min diff b/w them. Once sorted then we add nums at even position to result.
        #Time complexity - O(nlogn)
        #Space complexity - O(1)
        nums.sort()
        res = 0
        for i in range(0, len(nums),2):
            res += nums[i]
        return res

        