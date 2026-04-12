# Time Complexity : O(n) + O(min to max)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : We count how many times each number appears using a frequency bucket (array).
# Then we iterate from the smallest to largest number, pairing elements and skipping every second item.
# By always taking the smaller of each pair, we maximize the total of minimums.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        res = 0

        map = {}
        min_val = float('inf')
        max_val = float('-inf')

        for num in nums:
            map[num] = map.get(num, 0) + 1
            min_val = min(min_val, num)
            max_val = max(max_val, num)

        flag = False

        for i in range(min_val, max_val+1):
            if i not in map:
                continue
            if flag:
                map[i] -= 1

            freq = map[i]
            if freq % 2 == 0:
                res += (freq // 2) * i
                flag = False
            else:
                res += (freq // 2) * i
                res += i
                flag = True

        return res
        