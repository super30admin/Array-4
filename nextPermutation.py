'''
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: Break the solution into 3 steps:
Step 1: Find the leftmost element to swap, we start from the end(lexicographically hence) and keep going till we
reach the start. find the first element in which a[i] is not >= a[i+1]
Step 2: If i!==-1 then Find the rightmost element to swap, we start from the end until we reach a value the index on the
left <=element from the right. Swap index on left with index on right.
Step 4: Reverse the list
'''


class Solution:
    def reverse(self, nums: List[int], start: int, end: int) -> list:
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1

    def nextPermutation(self, a: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        n = len(a)

        i = n - 2

        # why from back, because we want lexicographically
        # so find first element to swap
        while i >= 0 and a[i] >= a[i + 1]:
            i -= 1

        if i >= 0:
            j = n - 1
            while a[j] <= a[i]:
                j -= 1
            a[i], a[j] = a[j], a[i]

        self.reverse(a, i + 1, n - 1)

        return a


