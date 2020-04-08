from typing import List


class Solution:

    def maxSubArray(self, nums: List[int]) -> int:
        """
            https://leetcode.com/problems/maximum-subarray/
            Time Complexity - O(n)
            Space Complexity - O(1)
            'n' is the length of nums list
        """
        # edge case
        if not nums:
            return 0
        local_sum = global_sum = float('-inf')
        slow = fast = 0
        p1, p2 = slow, fast
        while fast < len(nums):
            local_sum += nums[fast]
            if nums[fast] > local_sum:
                local_sum = nums[fast]
                slow = fast
            if global_sum < local_sum:
                global_sum = local_sum
                p1 = slow
                p2 = fast
            fast += 1
        print(p1, ' ', p2)
        return global_sum

    def maxSubArray(self, nums: List[int]) -> int:
        """
            https://leetcode.com/problems/maximum-subarray/
            Time Complexity - O(n)
            Space Complexity - O(1)
            'n' is the length of nums list
        """
        # edge case
        if not nums:
            return 0
        local_sum = global_sum = nums[0]
        for i in range(1, len(nums)):
            # two options
            # extend or take the element as it is
            local_sum = max(local_sum + nums[i], nums[i])
            global_sum = max(local_sum, global_sum)
        return global_sum

    def maxSubArray(self, nums: List[int]) -> int:
        """
            https://leetcode.com/problems/maximum-subarray/
            Time Complexity - O(n)
            Space Complexity - O(n)
            'n' is the length of nums list
        """
        # edge case
        if not nums:
            return 0
        max_sum = nums[0]
        for i in range(1, len(nums)):
            # two options
            # extend or take the element as it is
            nums[i] = max(nums[i - 1] + nums[i], nums[i])
            max_sum = max(nums[i], max_sum)
        return max_sum
