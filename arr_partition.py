class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        freq_map = {}
        res = 0
        min_val = float("inf")
        max_val = float("-inf")
        take_next = True

        for num in nums:
            freq_map[num] = freq_map.get(num, 0) + 1
            min_val = min(min_val, num)
            max_val = max(max_val, num)

        for i in range(min_val, max_val + 1):
            while freq_map.get(i, 0) > 0:
                if take_next:
                    res += i
                take_next = not take_next
                freq_map[i] -= 1
        return res


# time complexity is O(n)
# space complexity is O(n)
